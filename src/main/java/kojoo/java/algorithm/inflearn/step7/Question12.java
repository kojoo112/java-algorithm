package kojoo.java.algorithm.inflearn.step7;

import java.util.ArrayList;
import java.util.Scanner;

public class Question12 {
    static int[] check;
    static int answer = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vertex = scanner.nextInt();
        int edge = scanner.nextInt();
        check = new int[vertex + 1];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertex; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edge; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            graph.get(x).add(y);
        }

        check[1] = 1;
        dfs(1, vertex, edge, graph);
        System.out.println(answer);
    }

    private static void dfs(int depth, int vertex, int edge, ArrayList<ArrayList<Integer>> graph) {
        if (depth == vertex) {
            answer++;
        } else {
            for (int number : graph.get(depth)) {
                if (check[number] == 0) {
                    check[number] = 1;
                    dfs(number, vertex, edge, graph);
                    check[number] = 0;
                }
            }
        }
    }
}
