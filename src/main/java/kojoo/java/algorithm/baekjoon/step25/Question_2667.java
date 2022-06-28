package kojoo.java.algorithm.baekjoon.step25;

import java.util.Arrays;
import java.util.Scanner;


public class Question_2667 {

    static int[][] map;
    private static int apartComplex = 0;
    private static boolean[][] visited;
    private static int[] apart = new int[25*25];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        map = new int[size][size];
        visited = new boolean[size][size];

        for (int i = 0; i < size; i++) {
            String input = scanner.next();
            for (int j = 0; j < size; j++) {
                map[i][j] = input.charAt(j) - 48;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    apartComplex++;
                    dfs(i, j);
                }
            }
        }

        System.out.println(apartComplex);
        Arrays.sort(apart);

        for (int i = 0; i < apart.length; i++) {
            if(apart[i] > 0) {
                System.out.println(apart[i]);
            }
        }


    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        apart[apartComplex]++;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < map.length && ny >= 0 && ny < map.length) {
                if (map[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }

    }


}
