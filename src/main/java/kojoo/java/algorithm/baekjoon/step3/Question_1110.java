package kojoo.java.algorithm.baekjoon.step3;

import java.util.Scanner;

public class Question_1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int temp = n;
        int count = 0;

        while(true) {
            int left = temp / 10;
            int right = temp % 10;
            temp = right * 10 + (left + right) % 10;
            count++;
            if (n == temp) {
                break;
            }
        }

        System.out.println(count);
    }
}
