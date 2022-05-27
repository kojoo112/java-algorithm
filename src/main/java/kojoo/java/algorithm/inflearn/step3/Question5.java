package kojoo.java.algorithm.inflearn.step3;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetNumber = scanner.nextInt();

        System.out.println(solution(targetNumber));
    }

    private static int solution(int targetNumber) {
        int answer = 0;
        int sum = 0;
        int index = 1;

        for (int i = 1; i < targetNumber; i++) {
            sum += i;
            if (sum == targetNumber) {
                answer++;
            }
            while (sum > targetNumber) {
                sum -= index++;
                if (sum == targetNumber) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
