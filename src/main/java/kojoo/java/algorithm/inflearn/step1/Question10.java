package kojoo.java.algorithm.inflearn.step1;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char letter = scanner.next().charAt(0);

        for (int i : solution(input, letter)) {
            System.out.print(i + " ");
        }
    }

    private static int[] solution(String input, char letter) {
        int[] answer = new int[input.length()];

        int position = 1000;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == letter) {
                position = 0;
                answer[i] = position;
            } else {
                position++;
                answer[i] = position;
            }
        }

        position = 1000;
        for (int i = input.length() - 1; i>=0; i--) {
            if (input.charAt(i) == letter) {
                position = 0;
                answer[i] = position;
            } else {
                position++;
                answer[i] = Math.min(position, answer[i]);
            }
        }

        return answer;
    }
}
