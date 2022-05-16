package kojoo.java.algorithm.baekjoon.step4;

import java.util.Arrays;
import java.util.Scanner;

public class Question_10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(numbers);

        System.out.println(numbers[0] + " " + numbers[n - 1]);
    }
}
