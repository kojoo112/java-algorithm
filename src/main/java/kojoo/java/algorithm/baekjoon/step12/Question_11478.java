package kojoo.java.algorithm.baekjoon.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Question_11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            sb.setLength(0);
            for (int j = i; j < input.length(); j++) {
                sb.append(input.charAt(j));
                set.add(sb.toString());
            }
        }

        System.out.println(set.size());

    }
}
