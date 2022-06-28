package kojoo.java.algorithm.baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Question_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            list.add(Integer.valueOf(br.readLine()));
        }
        Collections.sort(list);

        for(int answer : list) {
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }
}
