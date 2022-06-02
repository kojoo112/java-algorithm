package kojoo.java.algorithm.baekjoon.step8;

import java.util.Scanner;

public class Question_1978 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        int n = scanner.nextInt();
        int[] primeNumbers = makePrimeNumbers();

        for (int i = 0; i < n; i++) {
            if (primeNumbers[scanner.nextInt()] == 0) {
                answer++;
            }
        }
        System.out.println(answer);

    }

    private static int[] makePrimeNumbers() {
        int[] primeNumbers = new int[1001];
        primeNumbers[0] = primeNumbers[1] = 1;

        for (int i = 2; i <= 1000; i++) {
            for (int j = i * i; j <= 1000; j = j + i) {
                if (primeNumbers[i] == 0) {
                    primeNumbers[j] = 1;
                }
            }
        }

        return primeNumbers;
    }
}
