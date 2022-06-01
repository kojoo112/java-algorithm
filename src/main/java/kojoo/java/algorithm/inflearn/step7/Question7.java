package kojoo.java.algorithm.inflearn.step7;

import java.util.LinkedList;
import java.util.Queue;

public class Question7 {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);

        solution(node);
    }

    private static void solution(Node node) {
        Queue<Node> queue = new LinkedList<>();

        queue.offer(node);
        int depth = 0;

        while(!queue.isEmpty()) {
            int size = queue.size();
            System.out.print(depth+ " : ");

            for (int i = 0; i < size; i++) {
                Node now = queue.poll();
                System.out.print(now.top + " ");

                if (now.left != null) {
                    queue.offer(now.left);
                }
                if (now.right != null) {
                    queue.offer(now.right);
                }
            }
            depth++;
            System.out.println();
        }

    }
}
