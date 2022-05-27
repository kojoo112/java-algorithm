package kojoo.java.algorithm.programmers.dfs;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistance {

    int answer = Integer.MAX_VALUE;
    boolean[][] visited;
    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};
    int n, m;

    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;

        visited = new boolean[n][m];
        dfs(maps, 0, 0, 0);
        if (answer == Integer.MAX_VALUE) {
            return -1;
        }
        return answer;
    }

    private void dfs(int[][] maps, int x, int y, int count) {
        visited[x][y] = true;
        if (x == n - 1 && y == m - 1) {
            answer = Math.min(count + 1, answer);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                if (maps[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    dfs(maps, nx, ny, count + 1);
                    visited[nx][ny] = false;
                }
            }
        }
    }

    public int solution2(int[][] maps) {
        int answer = -1;
        int n = maps.length;
        int m = maps[0].length;

        boolean[][] visited2 = new boolean[n][m];
        Queue<Location> stack = new LinkedList<>();
        stack.offer(new Location(0, 0, 1));

        while(!stack.isEmpty()) {
            Location now = stack.poll();

            if (now.x == n -1 && now.y == m - 1) {
                return now.steps;
            }
            visited2[now.x][now.y] = true;

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (maps[nx][ny] == 1 && !visited2[nx][ny]) {
                        visited2[nx][ny] = true;
                        stack.offer(new Location(nx, ny, now.steps + 1));
                    }
                }
            }
        }

        return answer;
    }
}
class Location {
    int x;
    int y;
    int steps;

    Location(int x, int y, int steps) {
        this.x = x;
        this.y = y;
        this.steps = steps;
    }
}