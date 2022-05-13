package kojoo.java.algorithm.programmers.dfs;

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
}
