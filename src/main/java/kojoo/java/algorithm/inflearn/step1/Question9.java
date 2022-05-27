package kojoo.java.algorithm.inflearn.step1;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(solution(input));
    }

    private static int solution(String input) {
        input = input.replaceAll("\\D", "");
        int answer = 0;

        for (int i = 0; i < input.length(); i++) {
            answer = answer * 10 + Integer.parseInt(String.valueOf(input.charAt(i)));
        }

        return answer;
    }
}
