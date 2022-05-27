package kojoo.java.algorithm.inflearn.step2;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] a = new int[count];
        int[] b = new int[count];

        for (int i = 0; i < count; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < count; i++) {
            b[i] = scanner.nextInt();
        }

        for (String answer : solution(count, a, b)) {
            System.out.println(answer);
        }
    }

    private static String[] solution(int count, int[] a, int[] b) {
        String[] answer = new String[count];
        for (int i = 0; i < count; i++) {

            if (a[i] == b[i]) {
                answer[i] = "D";
            } else if (a[i] == 1 && b[i] == 3) {
                answer[i] = "A";
            } else if (a[i] == 2 && b[i] == 1) {
                answer[i] = "A";
            } else if (a[i] == 3 && b[i] == 2) {
                answer[i] = "A";
            } else {
                answer[i] = "B";
            }
        }

        return answer;
    }
}
