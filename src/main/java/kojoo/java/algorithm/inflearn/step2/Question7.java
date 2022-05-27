package kojoo.java.algorithm.inflearn.step2;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] check = new int[n];

        for (int i = 0; i < n; i++) {
            check[i] = scanner.nextInt();
        }

        System.out.println(solution(check));
    }

    private static int solution(int[] check) {
        int result = 0;
        int score = 1;

        for (int i : check) {
            if (i == 1) {
                result += score++;
            } else {
                score = 1;
            }
        }
        return result;
    }
}
