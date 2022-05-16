package kojoo.java.algorithm.baekjoon.step4;

import java.util.Scanner;

public class Question_3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] remains = new int[42];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            remains[scanner.nextInt() % 42]++;
        }

        for (int i : remains) {
            if (i > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
