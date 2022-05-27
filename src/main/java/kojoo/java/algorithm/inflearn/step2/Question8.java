package kojoo.java.algorithm.inflearn.step2;

import java.util.Arrays;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }
        scanner.close();

        for (int answer : solution(scores)) {
            System.out.print(answer + " ");
        }
    }

    private static int[] solution(int[] scores) {
        int[] rank = new int[scores.length];
        Arrays.fill(rank, 1);

        for (int i = 0; i <= scores.length - 1; i++) {
            for (int score : scores) {
                if (scores[i] < score) {
                    rank[i]++;
                }
            }
        }

        return rank;
    }
}
