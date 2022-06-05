package kojoo.java.algorithm.baekjoon.step10;

import java.util.Scanner;

public class Question_2798 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int targetNumber = scanner.nextInt();
        int[] cards = new int[n];

        for (int i = 0; i < n; i++) {
            cards[i] = scanner.nextInt();
        }

        blackJack(targetNumber, cards);
    }

    private static void blackJack(int targetNumber, int[] cards) {
        int answer = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < cards.length; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                for (int k = j + 1; k < cards.length; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    int abs = Math.abs(sum - targetNumber);
                    if (sum <= targetNumber && abs < min) {
                        min = abs;
                        answer = sum;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
