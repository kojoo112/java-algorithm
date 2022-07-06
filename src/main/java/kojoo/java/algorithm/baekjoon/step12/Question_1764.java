package kojoo.java.algorithm.baekjoon.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Question_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> notHeard = new HashMap<>();

        for (int i = 0; i < n; i++) {
            notHeard.put(br.readLine(), 0);
        }

        List<String> notHeardAndSeen = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            String notSeenMan = br.readLine();
            if (notHeard.containsKey(notSeenMan)) {
                notHeardAndSeen.add(notSeenMan);
            }
        }

        StringBuilder sb = new StringBuilder();

        sb.append(notHeardAndSeen.size()).append('\n');

        Collections.sort(notHeardAndSeen);

        for (String targetMan : notHeardAndSeen) {
            sb.append(targetMan).append('\n');
        }

        System.out.println(sb);
    }
}
