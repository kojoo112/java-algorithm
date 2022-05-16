package kojoo.java.algorithm.baekjoon.step4;

import java.util.Scanner;

public class Question_2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int multipleResult = a * b * c;

        int[] result = new int[10];

        while(multipleResult > 0) {
            result[multipleResult % 10]++;
            multipleResult /= 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(result[i]);
        }
    }
}
