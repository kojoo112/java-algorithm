package kojoo.java.algorithm.baekjoon.step8;

import java.util.Scanner;

public class Question_9020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] inputs = new int[n];
        int[] primeNumbers = makePrimeNumbers();

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = scanner.nextInt();
        }

        for (int input : inputs) {
            for (int i = input / 2; i >= 2; i--) {
                if (primeNumbers[i] == 0 && primeNumbers[input - i] == 0) {
                    System.out.println(i + " " + (input - i));
                    break;
                }
            }
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
