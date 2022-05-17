package kojoo.java.algorithm.baekjoon.step7;

import java.util.Scanner;

public class Question_2839 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sugar = scanner.nextInt();

        if (sugar == 4 || sugar == 7) {
            System.out.println(-1);
        }
        else if (sugar % 5 == 0) {
            System.out.println(sugar / 5);
        }
        else if (sugar % 5 == 1 || sugar % 5 == 3) {
            System.out.println((sugar / 5) + 1);
        }
        else if (sugar % 5 == 2 || sugar % 5 == 4) {
            System.out.println((sugar / 5) + 2);
        }
    }
}
