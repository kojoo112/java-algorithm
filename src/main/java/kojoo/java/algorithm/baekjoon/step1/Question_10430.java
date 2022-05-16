package kojoo.java.algorithm.baekjoon.step1;

import java.util.Scanner;

public class Question_10430 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println((a + b) % c);
        System.out.println(((a % c) + (b % c)) % c);
        System.out.println((a * b) % c);
        System.out.println((a % c) * (b % c) % c);
    }
}
