package kojoo.java.algorithm.baekjoon.step7;

import java.util.Scanner;

public class Question_1712 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fixedCost = scanner.nextInt();
        int productionCost = scanner.nextInt();
        int salesProfit = scanner.nextInt();

        int answer = 0;

        if (salesProfit - productionCost < 1) {
            answer = -1;
        } else {
            answer = fixedCost / (salesProfit - productionCost) + 1;
        }

        System.out.println(answer);
    }
}
