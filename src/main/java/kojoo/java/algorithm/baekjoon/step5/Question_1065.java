package kojoo.java.algorithm.baekjoon.step5;

import java.util.Scanner;

public class Question_1065 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(hansu(n));

    }

    private static int hansu(int number) {
        int count = 0;

        if (number < 100) {
            return number;
        } else {
            count = 99;

            for (int i = 100; i <= number; i++) {
                int hundred = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;

                if((hundred - ten) == (ten - one)) {
                    count++;
                }
            }
        }

        return count;
    }
}
