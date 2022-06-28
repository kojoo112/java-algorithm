package kojoo.java.algorithm.baekjoon.step25;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Question_2606 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int computer = scanner.nextInt();
        int edge = scanner.nextInt();
        int[][] computers = new int[computer + 1][computer + 1];
        boolean[] visited = new boolean[computer + 1];

        for (int i = 0; i < edge; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            computers[x][y] = computers[y][x] = 1;
        }

        dfs(computers, visited);
//        bfs(computers, visited);

    }

    private static void dfs(int[][] computers, boolean[] visited) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        visited[1] = true;
        int infestedComputer = 0;

        while (!stack.isEmpty()) {
            int now = stack.pop();

            for (int i = 1; i < computers[0].length; i++) {
                if (computers[now][i] == 1 && !visited[i]) {
                    stack.push(i);
                    visited[i] = true;
                    infestedComputer++;
                }
            }
        }
        System.out.println(infestedComputer);
    }

    private static void bfs(int[][] computers, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        visited[1] = true;
        int infestedComputer = 0;

        while (!queue.isEmpty()) {
            int now = queue.poll();

            for (int i = 1; i < computers[0].length; i++) {
                if (computers[now][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                    infestedComputer++;
                }
            }
        }
        System.out.println(infestedComputer);
    }
}
