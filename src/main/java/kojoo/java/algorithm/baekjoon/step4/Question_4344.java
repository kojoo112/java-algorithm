package kojoo.java.algorithm.baekjoon.step4;

import java.util.Scanner;

public class Question_4344 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int subject = scanner.nextInt();
            int[] scores = new int[subject];
            double sum = 0;
            for (int j = 0; j < subject; j++) {
                scores[j] = scanner.nextInt();
                sum += scores[j];
            }
            double average = sum / subject;
            double averageCount = 0;
            for (int j = 0; j < subject; j++) {
                if (scores[j] > average) {
                    averageCount++;
                }
            }
            double averageClass = averageCount / subject * 100;
            System.out.printf("%.3f", averageClass);
            System.out.println("%");
        }
    }
}
