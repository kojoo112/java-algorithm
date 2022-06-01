package kojoo.java.algorithm.inflearn.step7;

import java.util.Scanner;
import java.util.Stack;

public class Question11 {
    static int[] visited;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vertex = scanner.nextInt();
        int edge = scanner.nextInt();
        int[][] graph = new int[vertex + 1][vertex + 1];
        visited = new int[vertex + 1];
        for (int i = 0; i < edge; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            graph[x][y] = 1;
        }

        System.out.println(solution(vertex, edge, graph));
    }

    private static int solution(int vertex, int edge, int[][] graph) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(1);

        while (!stack.isEmpty()) {
            int now = stack.pop();

            for (int i = 1; i <= vertex; i++) {
                if (graph[now][i] == 1 && visited[i] == 0) {
                    visited[i] = 1;
                    stack.push(i);
                }

            }
            answer++;
        }
        return answer;
    }
}
