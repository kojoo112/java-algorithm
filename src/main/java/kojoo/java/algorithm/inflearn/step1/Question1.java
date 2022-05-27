package kojoo.java.algorithm.inflearn.step1;

import java.util.Scanner;

public class Question1 {
    public static int solution(String input, char letter) {
        int answer = 0;
        letter = Character.toLowerCase(letter);
        for (char c : input.toLowerCase().toCharArray()) {
            if (c == letter) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        char letter = scanner.next().charAt(0);

        System.out.println(solution(input, letter));
    }
}
