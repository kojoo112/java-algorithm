package kojoo.java.algorithm.baekjoon.step6;

import java.util.Arrays;
import java.util.Scanner;

public class Question_10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        int[] usedLetterArray = new int[26];
        Arrays.fill(usedLetterArray, -1);

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (usedLetterArray[ch - 'a']  == -1) {
                usedLetterArray[ch - 'a'] = i;
            }
        }

        for (int index : usedLetterArray) {
            System.out.print(index + " ");
        }

    }
}
