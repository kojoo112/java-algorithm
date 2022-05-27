package kojoo.java.algorithm.inflearn.step1;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(solution(input));
    }

    private static String solution(String input) {
        input = input.toLowerCase().replaceAll("[^a-z]", "");

        int endIndex = input.length() - 1;
        for (int i = 0; i < endIndex; i++) {
            if (input.charAt(i) != input.charAt(endIndex--)) {
                return "NO";
            }
        }

        return "YES";
    }

}


