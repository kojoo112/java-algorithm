package kojoo.java.algorithm.inflearn.step3;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int targetNumber = scanner.nextInt();
        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println(solution(length, targetNumber, numbers));
    }

    private static int solution(int length, int targetNumber, int[] numbers) {
        int answer = 0;
        int sum = 0;

        int index = 0;
        for (int i = 0; i < length; i++) {
            sum += numbers[i];
            if (sum == targetNumber) {
                answer++;
            }
            while (sum >= targetNumber) {
                sum -= numbers[index++];
                if (sum == targetNumber) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
