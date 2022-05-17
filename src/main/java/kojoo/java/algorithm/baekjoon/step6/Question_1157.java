package kojoo.java.algorithm.baekjoon.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = bufferedReader.readLine().toUpperCase();
        int[] array = new int[26];
        int max = Integer.MIN_VALUE;
        char answer = '?';

        for (char ch : input.toCharArray()) {
            array[ch - 'A']++;
        }

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                answer = (char) (i + 65);
            } else if (max == array[i]) {
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}
