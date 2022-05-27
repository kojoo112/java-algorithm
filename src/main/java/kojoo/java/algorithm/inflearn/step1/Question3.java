package kojoo.java.algorithm.inflearn.step1;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(solution(input));
    }

    private static String solution(String input) {
        String[] temp = input.split(" ");
        String answer = "";
        int maxLength = Integer.MIN_VALUE;

        for (String str : temp) {
           if (str.length() > maxLength) {
               maxLength = str.length();
               answer = str;
           }
        }

        return answer;
    }
}
