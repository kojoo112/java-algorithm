package kojoo.java.algorithm.baekjoon.step7;

import java.util.Scanner;

public class Question_2775 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] apartment = new int[15][15];

        for (int i = 0; i < 15; i++) {
            apartment[i][1] = 1;
            apartment[0][i] = i;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                apartment[i][j] = apartment[i - 1][j] + apartment[i][j - 1];
            }
        }

        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println(apartment[k][n]);
        }
    }
}
