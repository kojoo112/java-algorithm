package kojoo.java.algorithm.inflearn.step1;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(solution(input));
    }

    private static String solution(String input) {
        StringBuilder answer = new StringBuilder();
        input += " ";
        int count = 1;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                answer.append(input.charAt(i));
                if (count != 1) {
                    answer.append(count);
                }

                count = 1;
            }
        }

        return answer.toString();
    }
}
