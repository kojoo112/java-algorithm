package kojoo.java.algorithm.baekjoon.step25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Question_1260 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int vertex = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        boolean[] visited = new boolean[vertex + 1];

        int[][] maps1 = new int[vertex + 1][vertex + 1];

        for (int i = 0; i < edge; i++) {
            StringTokenizer connectionTokenizer = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(connectionTokenizer.nextToken());
            int y = Integer.parseInt(connectionTokenizer.nextToken());
            maps1[x][y] = maps1[y][x] = 1;
        }

        int[][] maps2 = maps1.clone();

        dfs(maps1, target, visited);

        System.out.println();
        visited = new boolean[vertex + 1];

        bfs(maps2, target, visited);


    }

    private static void bfs(int[][] maps, int target, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(target);

        visited[target] = true;
        System.out.print(target + " ");

        while (!queue.isEmpty()) {
            int now = queue.poll();

            for (int i = 1; i < maps[0].length; i++) {
                if (maps[now][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }

    private static void dfs(int[][] maps, int target, boolean[] visited) {
        visited[target] = true;
        System.out.print(target + " ");

        for (int i = 1; i < maps[0].length; i++) {
            if (maps[target][i] == 1 && !visited[i]) {
                dfs(maps, i, visited);
            }
        }
    }
}
