package kojoo.java.algorithm.baekjoon.step8;

import java.util.Scanner;

public class Question_11653 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        while (n > 1) {
            int i;
            for (i = 2; i <= n; i++) {
                if (n % i == 0) {
                    System.out.println(i);
                    break;
                }
            }
            n = n / i;
        }
    }
}
