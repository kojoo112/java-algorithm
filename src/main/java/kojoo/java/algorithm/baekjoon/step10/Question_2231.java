package kojoo.java.algorithm.baekjoon.step10;

import java.util.Scanner;

public class Question_2231 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetNumber = scanner.nextInt();

        System.out.println(numberConstructor(targetNumber));

    }

    private static int numberConstructor(int targetNumber) {
        int answer = 0;

        for (int i = 1; i <= targetNumber; i++) {
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum + i == targetNumber) {
                answer = i;
                return answer;
            }
        }
        return answer;
    }
}
