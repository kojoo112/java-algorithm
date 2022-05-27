package kojoo.java.algorithm.inflearn.step1;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        System.out.println(solution(input));
        scanner.close();
    }

    private static String solution(String input) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.indexOf(input.charAt(i)) == i) {
                answer.append(input.charAt(i));
            }
        }

        return String.valueOf(answer);
    }
}
