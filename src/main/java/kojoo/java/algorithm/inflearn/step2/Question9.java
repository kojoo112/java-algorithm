package kojoo.java.algorithm.inflearn.step2;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] board = new int[n][n];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        int topLeftBottomRightSum = 0;
        int topRightBottomLeftSum = 0;

        for (int i = 0; i < n; i++) {
            int horizontalSum = 0;
            int verticalSum = 0;
            for (int j = 0; j < n; j++) {
                horizontalSum += board[i][j];
                verticalSum += board[j][i];
                if (i == j) {
                    topLeftBottomRightSum += board[i][j];
                } else if (i == n - j - 1) {
                    topRightBottomLeftSum += board[i][j];
                }
            }
            max = Math.max(horizontalSum, max);
            max = Math.max(verticalSum, max);
        }
        max = Math.max(max, Math.max(topLeftBottomRightSum, topRightBottomLeftSum));

        System.out.println(max);
    }
}
