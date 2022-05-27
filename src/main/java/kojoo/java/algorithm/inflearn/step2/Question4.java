package kojoo.java.algorithm.inflearn.step2;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        for (int answer : solution(count)) {
            System.out.print(answer + " ");
        }
    }

    private static int[] solution(int count) {
        int[] fibonacci = new int[count];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2; i < count; i++) {
            fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
        }

        return fibonacci;
    }
}
