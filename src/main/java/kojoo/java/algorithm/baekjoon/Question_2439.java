package kojoo.java.algorithm.baekjoon;

import java.util.Scanner;

public class Question_2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - (n - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
