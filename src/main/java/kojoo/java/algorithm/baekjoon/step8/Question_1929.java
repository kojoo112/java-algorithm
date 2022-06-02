package kojoo.java.algorithm.baekjoon.step8;

import java.util.Scanner;

public class Question_1929 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        long[] primeNumbers = makePrimeNumbers();

        for (int i = start; i <= end; i++) {
            if (primeNumbers[i] == 0) {
                System.out.println(i);
            }
        }
    }

    private static long[] makePrimeNumbers() {
        long[] primeNumbers = new long[1000001];
        primeNumbers[0] = primeNumbers[1] = 1;

        for (long i = 2; i <= 1000000; i++) {
            for (long j = i * i; j <= 1000000; j += i) {
                if (primeNumbers[(int) i] == 0) {
                    primeNumbers[(int) j] = 1;
                }
            }
        }

        return primeNumbers;
    }
}
