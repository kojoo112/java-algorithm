package kojoo.java.algorithm.baekjoon.step9;

import java.util.Scanner;

public class Question_10870 {
    static int[] fibonacci;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        fibonacci = new int[n + 1];

        if (n == 0) {
            System.out.println(0);
        } else {
            makeFibonacciArray(n);
            System.out.println(fibonacci[n]);
        }
    }

    private static int makeFibonacciArray(int n) {
        if (n == 1) {
            return fibonacci[1] = 1;
        } else if (n == 2) {
            return fibonacci[2] = 1;
        } else {
            return fibonacci[n] = makeFibonacciArray(n - 2) + makeFibonacciArray(n - 1);
        }
    }

}
