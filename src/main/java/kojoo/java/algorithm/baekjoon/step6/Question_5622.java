package kojoo.java.algorithm.baekjoon.step6;

import java.util.Scanner;

public class Question_5622 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] dial = {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = 2; j < dial.length; j++) {
                if (dial[j].contains(String.valueOf(input.charAt(i)))) {
                    sum += j + 1;
                }
            }
        }
        System.out.println(sum);
    }
}
