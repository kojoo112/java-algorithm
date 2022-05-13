package kojoo.java.algorithm.programmers.dfs;

public class Network {

    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[200];
        int answer = 0;

        for (int i = 0; i < computers.length; i++) {
            if (!visited[i]) {
                answer++;
                dfs(i, computers, visited);
            }
        }

        return answer;
    }

    private void dfs(int start, int[][] computers, boolean[] visited) {
        visited[start] = true;

        for (int i = 0; i < computers.length; i++) {
            if (!visited[i] && computers[start][i] == 1) {
                dfs(i, computers, visited);
            }
        }
    }
}
