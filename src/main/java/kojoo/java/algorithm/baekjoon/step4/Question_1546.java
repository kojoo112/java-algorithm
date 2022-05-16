package kojoo.java.algorithm.baekjoon.step4;

import java.util.Arrays;
import java.util.Scanner;

public class Question_1546 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int subject = scanner.nextInt();
        double[] scores = new double[subject];

        for (int i = 0; i < subject; i++) {
            scores[i] = scanner.nextInt();
        }
        Arrays.sort(scores);

        double max = scores[subject - 1];
        double sum = 0;

        for (int i = 0; i <subject; i++) {
            sum += scores[i] / max * 100;
        }

        System.out.println(sum / subject);
    }
}
