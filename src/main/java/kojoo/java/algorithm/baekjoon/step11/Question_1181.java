package kojoo.java.algorithm.baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Question_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] inputs = new String[n];

        for (int i = 0; i < n; i++) {
            inputs[i] = br.readLine();
        }

        Arrays.sort(inputs, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            } else {
                return a.length() - b.length();
            }
        });

        sb.append(inputs[0]).append('\n');

        for (int i = 1; i < n; i++) {
            if (!inputs[i].equals(inputs[i - 1])) {
                sb.append(inputs[i]).append('\n');
            }
        }

        System.out.println(sb);
    }
}
