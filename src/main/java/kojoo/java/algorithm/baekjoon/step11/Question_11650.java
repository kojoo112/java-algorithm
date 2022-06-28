package kojoo.java.algorithm.baekjoon.step11;

import java.util.Arrays;
import java.util.Scanner;

public class Question_11650 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][2];
        int[][] answer = new int[n][2];

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            arr[i][0] = x;
            arr[i][1] = y;
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            } else {
                return a[0] - b[0];
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
