package kojoo.java.algorithm.programmers.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//maze	queries	result
//["AAAAA", "AABBB", "CAEFG", "AAEFF"]	["1 1 1 5 AF", "1 1 4 5 AF", "2 1 4 5 FAE", "1 5 4 5 ABF", "1 1 4 1 A"]	[5, -1, 7, 6, 6]
//["AAA", "ABB", "ABA"]	["1 1 1 3 A", "1 3 3 1 A", "1 1 3 3 A", "1 1 3 3 AB"]	[3, 5, -1, 5]

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

public class NHNGame3 {
    public int[] solution(String[] maze, String[] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1);
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        Queue<Position> stack = new LinkedList<>();

        for (int i = 0; i < queries.length; i++) {
            boolean[][] visited = new boolean[maze.length][maze[0].length()];
            int min = Integer.MAX_VALUE;

            String[] query = queries[i].split(" ");
            int startX = Integer.parseInt(query[0]) - 1;
            int startY = Integer.parseInt(query[1]) - 1;
            int targetX = Integer.parseInt(query[2]) - 1;
            int targetY = Integer.parseInt(query[3]) - 1;
            String move = query[4];

            stack.clear();
            stack.offer(new Position(new Node(startX, startY), 1));

            visited[startX][startY] = true;
            while(!stack.isEmpty()) {
                int size = stack.size();

                for (int j = 0; j < size; j++) {
                    Position now  = stack.poll();

                    for (int k = 0; k < 4; k++) {
                        int nx = now.node.x + dx[k];
                        int ny = now.node.y + dy[k];
                        if (now.node.x == targetX && now.node.y == targetY) {
                            if (min > now.steps) {
                                min = now.steps;
                                answer[i] = min;
                            }

                        }
                        if (nx >= 0 && ny >= 0 && nx < maze.length && ny < maze[0].length()) {
                            for (int s = 0; s < move.length(); s++) {
                                if (maze[nx].charAt(ny) == move.charAt(s) && !visited[nx][ny]) {
                                    visited[nx][ny] = true;
                                    stack.offer(new Position(new Node(nx, ny), now.steps + 1));
                                }
                            }
                        }
                    }
                }
            }

        }

        return answer;
    }
}
