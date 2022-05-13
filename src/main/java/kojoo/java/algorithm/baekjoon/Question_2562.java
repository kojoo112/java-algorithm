package kojoo.java.algorithm.baekjoon;

import java.util.Scanner;

public class Question_2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[9];
        int index = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 9; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                index = i + 1;
            }
        }

        System.out.println(max + "\n" + index);
    }
}
