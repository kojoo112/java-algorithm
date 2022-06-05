package kojoo.java.algorithm.baekjoon.step10;

import java.util.Scanner;

public class Question_7568 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int [][] array = new int[n][2];

        for (int i = 0; i < n; i++) {
            array[i][0] = scanner.nextInt();
            array[i][1] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (array[i][0] < array[j][0] && array[i][1] < array[j][1]) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }

    }
}
