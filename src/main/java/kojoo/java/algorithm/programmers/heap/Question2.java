package kojoo.java.algorithm.programmers.heap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    int n;
    int distance;
    boolean visit = false;
    List<Node> links = new LinkedList<>();

    Node(int n) {
        this.n = n;
    }
}

public class Question2 {
    public int solution(int n, int[][] edge) {
        List<Node> list = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            list.add(new Node(i + 1));
        }

        for (int[] e : edge) {
            Node n1 = list.get(e[0] - 1);
            Node n2 = list.get(e[1] - 1);
            n1.links.add(n2);
            n2.links.add(n1);
        }

        int maxDistance = 0;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(list.get(0));

        while (!queue.isEmpty()) {
            Node now = queue.poll();
            now.visit = true;

            for (Node node : now.links) {
                if (!node.visit) {
                    node.visit = true;
                    node.distance = now.distance + 1;
                    queue.offer(node);

                    maxDistance = Math.max(maxDistance, node.distance);
                }
            }
        }
        int answer = 0;
        for (Node node : list) {
            if (node.distance == maxDistance) {
                answer++;
            }
        }
        return answer;
    }
}


