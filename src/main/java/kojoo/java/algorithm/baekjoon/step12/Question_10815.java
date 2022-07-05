package kojoo.java.algorithm.baekjoon.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Question_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            int card = Integer.parseInt(st.nextToken());
            map.put(card, 0);
        }

        int m = Integer.parseInt(br.readLine());
        int[] answers = new int[m];

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < m; i++) {
            int targetCard = Integer.parseInt(st.nextToken());
            if (map.containsKey(targetCard)) {
                answers[i] = 1;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int answer : answers) {
            sb.append(answer).append(" ");
        }

        System.out.println(sb);

    }
}
