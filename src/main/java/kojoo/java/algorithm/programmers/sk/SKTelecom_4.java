package kojoo.java.algorithm.programmers.sk;

import java.util.Stack;

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

public class SKTelecom_4 {
    public int solution(String[] grid, int k) {
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        int answer = 0;
        int n = grid.length;
        int m = grid[0].length();
        boolean[][] visited = new boolean[n][m];
        int min = Integer.MAX_VALUE;
        int rest = 0;

        Stack<Position> queue = new Stack<>();
        queue.push(new Position(new Node(0, 0), 0));
        visited[0][0] = true;


        while (!queue.isEmpty()) {

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Position now = queue.pop();

                if (now.node.x == n -1 && now.node.y == m - 1) {
                    System.out.println(now.steps);
                }

                for (int j = 0; j < 4; j++) {
                    int nx = now.node.x + dx[j];
                    int ny = now.node.y + dy[j];


                    if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                        if (grid[nx].charAt(ny) != '#' && !visited[nx][ny]
                                ) {
                            visited[nx][ny] = true;
                            queue.push(new Position(new Node(nx, ny), now.steps + 1));

                        }
                    }
                }
            }

        }

        return answer;
    }


}
