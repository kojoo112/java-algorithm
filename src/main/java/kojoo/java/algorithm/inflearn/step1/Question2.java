package kojoo.java.algorithm.inflearn.step1;

import java.util.Scanner;

public class Question2 {
    public static String solution(String input) {
        StringBuilder answer = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                answer.append(Character.toUpperCase(c));
            } else {
                answer.append(Character.toLowerCase(c));
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        System.out.println(solution(input));
    }
}
