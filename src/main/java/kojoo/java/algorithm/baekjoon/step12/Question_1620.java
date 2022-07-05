package kojoo.java.algorithm.baekjoon.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Question_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        String[] nameArray = new String[n + 1];

        for (int i = 1; i <= n; i++) {
            String pokemon = br.readLine();
            map.put(pokemon, i);
            nameArray[i] = pokemon;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String input = br.readLine();
            if (isStringNumber(input)) {
                sb.append(nameArray[Integer.parseInt(input)]).append('\n');
            } else {
                sb.append(map.get(input)).append('\n');
            }
        }

        System.out.println(sb);
    }

    private static boolean isStringNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
