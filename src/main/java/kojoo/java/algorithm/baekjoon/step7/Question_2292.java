package kojoo.java.algorithm.baekjoon.step7;

import java.util.Scanner;

public class Question_2292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int range = 2;
        int count = 1;

        if (n == 1) {
            System.out.println(1);
        } else {
            while(range <= n) {
                range = range + (6 * count);
                count++;
            }
            System.out.println(count);
        }

    }
}
