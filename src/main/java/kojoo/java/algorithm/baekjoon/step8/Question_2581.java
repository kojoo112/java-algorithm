package kojoo.java.algorithm.baekjoon.step8;

import java.util.Scanner;

public class Question_2581 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int minPrimeNumber = Integer.MAX_VALUE;
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[] primeNumbers = makePrimeNumbers();

        for (int i = m; i <= n; i++) {
            if (primeNumbers[i] == 0) {
                sum  += i;
                count++;
                if (minPrimeNumber > i) {
                    minPrimeNumber = i;
                }
            }
        }

        if (count == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum +  "\n" + minPrimeNumber);
        }
    }

    private static int[] makePrimeNumbers() {
        int[] primeNumbers = new int[10001];
        primeNumbers[0] = primeNumbers[1] = 1;

        for (int i = 2; i <= 10000; i++) {
            for (int j = i * i; j <= 10000; j += i) {
                if (primeNumbers[i] == 0) {
                    primeNumbers[j] = 1;
                }
            }
        }

        return primeNumbers;
    }
}
