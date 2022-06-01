package kojoo.java.algorithm.inflearn.step7;

import java.util.Scanner;

public class Question4 {
    static int[] fibonacci;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        fibonacci = new int[number + 1];
        solution(scanner.nextInt());

        for (int i = 1; i < fibonacci.length; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }

    private static int solution(int number) {
        if (number == 1) {
            return fibonacci[1] = 1;
        } else if (number == 2) {
            return fibonacci[2] = 1;
        } else {
            return fibonacci[number] = solution(number-2) + solution(number - 1);
        }
    }
}
