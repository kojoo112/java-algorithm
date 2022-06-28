package kojoo.java.algorithm.baekjoon.step25;


import org.junit.jupiter.api.Assertions;

import java.util.LinkedList;
import java.util.Queue;

public class Question_4 {
    public static void main(String[] args) {
        int[][] maps1 = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        int[][] maps2 = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};

        Assertions.assertEquals(11, solution(maps1));
        Assertions.assertEquals(-1, solution(maps2));
    }

    private static int solution(int[][] maps) {
        int answer = -1;

        int n = maps.length;
        int m = maps[0].length;
        boolean[][] visited = new boolean[n][m];
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};
        int min = Integer.MAX_VALUE;

        Queue<Position> stack = new LinkedList<>();
        stack.offer(new Position(new Node(0, 0), 1));
        visited[0][0] = true;

        while (!stack.isEmpty()) {
            int size = stack.size();

            for (int i = 0; i < size; i++) {
                Position now = stack.poll();


                for (int j = 0; j < 4; j++) {
                    int nx = dx[j] + now.node.x;
                    int ny = dy[j] + now.node.y;

                    if (now.node.x == n - 1 && now.node.y == m - 1) {
                        if (min > now.steps) {
                            min = now.steps;
                            answer = min;
                        }
                    }

                    if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                        if (maps[nx][ny] == 1 && !visited[nx][ny]) {
                            visited[nx][ny] = true;
                            stack.offer(new Position(new Node(nx, ny), now.steps + 1));
                        }
                    }
                }

            }
        }


        return answer;
    }

}

class Node {
    int x;
    int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Position {
    Node node;
    int steps;

    public Position(Node node, int steps) {
        this.node = node;
        this.steps = steps;
    }
}
