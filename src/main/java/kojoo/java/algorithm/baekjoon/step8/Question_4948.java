package kojoo.java.algorithm.baekjoon.step8;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Question_4948 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = new LinkedList<>();
        long[] primeNumbers = makePrimeNumbers();
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            } else {
                inputList.add(input);
            }
        }

        for (int input : inputList) {
            int count = 0;
            for (int i = input + 1; i <= input * 2; i++) {
                if (primeNumbers[i] == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    private static long[] makePrimeNumbers() {
        long[] primeNumbers = new long[250001];
        primeNumbers[0] = primeNumbers[1] = 1;

        for (long i = 2; i <= 250000; i++) {
            for (long j = i * i; j <= 250000; j += i) {
                if (primeNumbers[(int) i] == 0) {
                    primeNumbers[(int) j] = 1;
                }
            }
        }

        return primeNumbers;
    }
}
