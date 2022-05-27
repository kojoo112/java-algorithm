package kojoo.java.algorithm.inflearn.step1;

import java.util.Scanner;
import java.util.Stack;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        System.out.println(solution(input));
    }

    private static String solution(String input) {
        StringBuilder answer = new StringBuilder(input);
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                stack.push(c);
            }
        }

        for (int i = 0; i < input.length(); i++) {
            if (Character.isAlphabetic(input.charAt(i))) {
                answer.replace(i, i+1, stack.pop().toString());
            }
        }

        return String.valueOf(answer);
    }
}
