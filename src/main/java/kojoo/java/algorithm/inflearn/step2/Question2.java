package kojoo.java.algorithm.inflearn.step2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = scanner.nextInt();
        int[] studentsInLine = new int[students];

        for (int i = 0; i < students; i++) {
            studentsInLine[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println(solution(studentsInLine));
    }

    private static int solution(int[] studentsInLine) {
        int count = 1;
        int maxHeight = studentsInLine[0];

        for (int i = 1; i < studentsInLine.length; i++) {
            if (maxHeight < studentsInLine[i]) {
                count++;
                maxHeight = studentsInLine[i];
            }
        }

        return count;
    }
}
