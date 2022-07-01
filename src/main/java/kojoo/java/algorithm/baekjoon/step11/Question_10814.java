package kojoo.java.algorithm.baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Question_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[][] inputs = new String[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            inputs[i][0] = st.nextToken();
            inputs[i][1] = st.nextToken();
        }

        Arrays.sort(inputs, Comparator.comparingInt(person -> Integer.parseInt(person[0])));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(inputs[i][0]).append(" ").append(inputs[i][1]).append('\n');
        }
        System.out.println(sb);
    }

}
