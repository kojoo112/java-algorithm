package kojoo.java.algorithm.baekjoon;

import java.util.Scanner;

public class Question_10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(scanner.nextInt() + scanner.nextInt());
        }
    }
}
