package kojoo.java.algorithm.baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Question_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] inputs = new int[n];
        int[] sorted = new int[n];
        Map<Integer, Integer> rankingMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            inputs[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorted);

        int rank = 0;
        for (int i : sorted) {
            if (!rankingMap.containsKey(i)) {
                rankingMap.put(i, rank++);
            }
        }


        StringBuilder sb = new StringBuilder();

        for (int key : inputs) {
            int ranking = rankingMap.get(key);
            sb.append(ranking).append(" ");
        }

        System.out.println(sb);
    }
}
