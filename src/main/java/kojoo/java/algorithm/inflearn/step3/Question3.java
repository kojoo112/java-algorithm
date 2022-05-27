package kojoo.java.algorithm.inflearn.step3;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();
        int checkDay = scanner.nextInt();
        int[] sales = new int[days];

        for (int i = 0; i < days; i++) {
            sales[i] = scanner.nextInt();
        }

        scanner.close();
        System.out.println(solution(days, checkDay, sales));
    }

    private static int solution(int days, int checkDay, int[] sales) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < checkDay; i++) {
            sum += sales[i];
        }
        answer = sum;

        for (int i = checkDay; i < days; i++) {
            sum  = sum + sales[i] - sales[i - checkDay];
            answer = Math.max(sum, answer);
        }

        return answer;
    }
}
