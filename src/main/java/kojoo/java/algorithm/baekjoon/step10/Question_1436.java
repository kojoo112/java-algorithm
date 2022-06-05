package kojoo.java.algorithm.baekjoon.step10;

import java.util.Scanner;

public class Question_1436 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.close();

        int num = 666;
        int count = 1;

        while (count != n) {
            num++;
            if (String.valueOf(num).contains("666")) {
                count++;
            }
        }
        System.out.println(num);
    }

    private static void apocalypticNumber(int n) {

    }
}
