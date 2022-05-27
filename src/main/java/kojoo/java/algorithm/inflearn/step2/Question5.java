package kojoo.java.algorithm.inflearn.step2;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int[] sosu = new int[n + 1];

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (sosu[i] == 0) {
                count++;
                for (int j = i; j <= n; j += i) {
                    sosu[j] = 1;
                }
            }
        }

        return count;
    }
}
