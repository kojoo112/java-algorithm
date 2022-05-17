package kojoo.java.algorithm.baekjoon.step6;

import java.util.Scanner;

public class Question_2941 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] croatian = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String s : croatian) {
            if (input.contains(s)) {
                input = input.replace(s, "!");
            }
        }
        System.out.println(input.length());
    }
}
