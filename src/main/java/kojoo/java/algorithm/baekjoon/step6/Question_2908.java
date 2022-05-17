package kojoo.java.algorithm.baekjoon.step6;


import java.util.Scanner;

public class Question_2908 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        int number1 = formatNumber(Integer.parseInt(input[0]));
        int number2 = formatNumber(Integer.parseInt(input[1]));

        System.out.println(Math.max(number1, number2));
    }

    private static int formatNumber(int number) {
        int hundred = number / 100;
        int ten = number / 10 % 10;
        int one = number % 10;

        return one * 100 + ten * 10 + hundred;
    }
}
