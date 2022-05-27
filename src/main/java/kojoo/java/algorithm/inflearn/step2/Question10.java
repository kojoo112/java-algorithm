package kojoo.java.algorithm.inflearn.step2;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] map = new int[n+2][n+2];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                map[i][j] = scanner.nextInt();
            }
        }

        System.out.println(solution(n, map));
    }

    private static int solution(int n, int[][] map) {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        int top = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                boolean high = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (map[i][j] <= map[nx][ny]) {
                        high = false;
                        break;
                    }
                }
                if (high) {
                    top++;
                }
            }
        }

        return top;
    }
}
