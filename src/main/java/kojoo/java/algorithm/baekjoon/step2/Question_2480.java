package kojoo.java.algorithm.baekjoon.step2;

import java.util.Arrays;
import java.util.Scanner;

public class Question_2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);

        if (numbers[0] == numbers[2]) {
            System.out.println(10000 + numbers[0] * 1000);
        } else if (numbers[0] == numbers[1] || numbers[1] == numbers[2]) {
            System.out.println(1000 + numbers[1] * 100);
        } else {
            System.out.println(100 * numbers[2]);
        }
    }
}