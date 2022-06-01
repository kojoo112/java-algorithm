package kojoo.java.algorithm.inflearn.step7;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        solution(100);
    }

    private static void solution(int number) {
        if (number == 0) {
            return;
        } else {
            solution(number - 1);
            System.out.print(number + " ");
        }
    }
}
