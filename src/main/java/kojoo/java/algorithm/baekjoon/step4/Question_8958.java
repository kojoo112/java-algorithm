package kojoo.java.algorithm.baekjoon.step4;

import java.util.Scanner;

public class Question_8958 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            String input = scanner.next();
            int score = 0;
            int increment = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == 'O') {
                    increment++;
                } else {
                    increment = 0;
                }
                score += increment;
            }
            System.out.println(score);
        }
    }
}
