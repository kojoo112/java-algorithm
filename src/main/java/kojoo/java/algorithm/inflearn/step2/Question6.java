package kojoo.java.algorithm.inflearn.step2;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int[] primeNumbers = getPrimeNumbers();

        for (int i = 0; i < n; i++) {
            int reverseNumber = makeReverseNumber(numbers[i]);
            if (primeNumbers[reverseNumber] == 0) {
                System.out.print(reverseNumber + " ");
            }
        }

    }

    private static int[] getPrimeNumbers() {
        int[] primeNumbers = new int[100001];
        primeNumbers[0] = primeNumbers[1] = 1;

        for (int i = 2; i <= 10000; i++) {
            for (int j = i * i; j <= 100000; j += i) {
                if (primeNumbers[i] == 0) {
                    primeNumbers[j] = 1;
                }
            }
        }

        return primeNumbers;
    }

    private static int makeReverseNumber(int number) {
        int reverseNumber = 0;

        while (number > 0) {
            reverseNumber = reverseNumber * 10 + (number % 10);
            number /= 10;
        }

        return reverseNumber;
    }
}
