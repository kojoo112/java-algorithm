package kojoo.java.algorithm.baekjoon.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Question_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        int answer = n;
        boolean[] check = new boolean[26];
        for (int i = 0; i < n; i++) {
            String input = bufferedReader.readLine();
            Arrays.fill(check, false);
            for (int j = 0; j < input.length(); j++) {
                int index = input.charAt(j) - 'a';
                if (check[index]) {
                    if (input.charAt(j) != input.charAt(j - 1)) {
                        answer--;
                        break;
                    }
                } else {
                    check[index] = true;
                }
            }
        }
        System.out.println(answer);
    }
}
