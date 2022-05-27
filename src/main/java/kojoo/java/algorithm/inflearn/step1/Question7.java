package kojoo.java.algorithm.inflearn.step1;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        System.out.println(solution(input));
    }

    private static String solution(String input) {
        input = input.toLowerCase();

        int endIndex = input.length() - 1;
        for (int i = 0; i < endIndex; i++) {
            if (input.charAt(i) != input.charAt(endIndex)) {
                return "NO";
            }
            endIndex--;
        }

        return "YES";
    }

}
