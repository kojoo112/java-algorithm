package kojoo.java.algorithm.baekjoon.step2;

import java.util.Scanner;

public class Question_1330 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(compare(a, b));
    }

    static String compare(int a, int b) {
        if (a > b) {
            return ">";
        } else if (a < b) {
            return "<";
        } else {
            return "==";
        }
    }
}
