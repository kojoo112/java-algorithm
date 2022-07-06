package kojoo.java.algorithm.baekjoon.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Question_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int sizeOfA = Integer.parseInt(st.nextToken());
        int sizeOfB = Integer.parseInt(st.nextToken());

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < sizeOfA; i++) {
            setA.add(Integer.valueOf(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < sizeOfB; i++) {
            setB.add(Integer.valueOf(st.nextToken()));
        }

        int answer = 0;

        for (int number : setA) {
            if (!setB.contains(number)) {
                answer++;
            }
        }

        for (int number : setB) {
            if (!setA.contains(number)) {
                answer++;
            }
        }

        System.out.println(answer);

    }

}
