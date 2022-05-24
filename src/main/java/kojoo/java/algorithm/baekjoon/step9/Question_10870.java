package kojoo.java.algorithm.baekjoon.step9;

import java.util.Scanner;

public class Question_10870 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println(0);
        } else {
            int[] fibonacci = new int[n + 1];
            fibonacci[1] = 1;
            scanner.close();
            for (int i = 2; i <= n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
            System.out.println(fibonacci[n]);
        }
    }

}
