package kojoo.java.algorithm.inflearn.step2;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = scanner.nextInt();
        int tests = scanner.nextInt();

        int[][] ranks = new int[tests][students];

        for (int i = 0; i < tests; i++) {
            for (int j = 0; j < students; j++) {
                ranks[i][j] = scanner.nextInt();
            }
        }
        System.out.println(solution(students, tests, ranks));
    }

    private static int solution(int students, int tests, int[][] ranks) {
        int answer = 0;

        for (int i = 1; i <= students; i++) {
            for (int j = 1; j <= students; j++) {
                int count = 0;
                for (int k = 0; k < tests; k++) {
                    int iPosition = 0;
                    int jPosition = 0;
                    for (int s = 0; s < students; s++) {
                        if (ranks[k][s] == i) {
                            iPosition = s;
                        }
                        if (ranks[k][s] == j) {
                            jPosition = s;
                        }
                    }
                    if (iPosition < jPosition) {
                        count++;
                    }
                }
                if (count == tests) {
                    answer++;
                }
            }

        }

        return answer;
    }
}
