package kojoo.java.algorithm.baekjoon.step9;

import java.util.Scanner;

public class Question_10872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.close();
        System.out.println(factorial(n));
    }

    private static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
