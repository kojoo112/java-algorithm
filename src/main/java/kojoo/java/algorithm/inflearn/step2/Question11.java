package kojoo.java.algorithm.inflearn.step2;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = scanner.nextInt();
        int[][] classes = new int[students + 1][6];

        for (int i = 1; i < students + 1; i++) {
            for (int j = 1; j <= 5; j++) {
                classes[i][j] = scanner.nextInt();
            }
        }

        System.out.println(solution(students, classes));
    }

    private static int solution(int students, int[][] classes) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= students; i++) {
            int count = 0;
            for (int j = 1; j <= students; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (classes[i][k] == classes[j][k]) {
                        count++;
                        break;
                    }
                }
            }
            if (max < count) {
                max = count;
                answer = i;
            }
        }

        return answer;
    }
}
