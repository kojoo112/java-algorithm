package kojoo.java.algorithm.baekjoon.step1;

import java.util.Scanner;

public class Question_2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int result = 0;
        int digit = 1;

        while (number2 > 0) {
            int factor = number2 % 10;
            int product = number1 * factor;
            System.out.println(product);
            result = result + (product * digit);
            number2 /= 10;
            digit *= 10;
        }

        System.out.println(result);

    }
}
