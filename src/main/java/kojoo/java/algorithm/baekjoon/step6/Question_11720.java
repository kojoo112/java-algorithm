package kojoo.java.algorithm.baekjoon.step6;

import java.util.Scanner;

public class Question_11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String number = scanner.next();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += number.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
