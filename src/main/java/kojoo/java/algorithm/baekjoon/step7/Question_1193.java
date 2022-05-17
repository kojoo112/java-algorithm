package kojoo.java.algorithm.baekjoon.step7;

import java.util.Scanner;

public class Question_1193 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int prevCountSum = 0;
        int crossCount = 1;

        while(true) {
            if (n <= prevCountSum + crossCount) {
                if (crossCount % 2 == 1) {
                    System.out.println((crossCount - (n - prevCountSum - 1)) + "/" + (n -  prevCountSum));
                } else {
                    System.out.println((n - prevCountSum) + "/" + (crossCount - (n - prevCountSum - 1)));
                }
                break;
            } else {
                prevCountSum += crossCount;
                crossCount++;
            }
        }
    }
}
