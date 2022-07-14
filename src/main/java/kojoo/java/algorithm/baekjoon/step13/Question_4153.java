package kojoo.java.algorithm.baekjoon.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Question_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] triangles = new int[3];

        StringBuilder sb = new StringBuilder();

        while (!input.equals("0 0 0")) {

            for (int i = 0; i < 3; i++) {
                String[] sides = input.split(" ");
                triangles[i] = Integer.parseInt(sides[i]);
            }

            Arrays.sort(triangles);

            if (triangles[0] * triangles[0] + triangles[1] * triangles[1] == triangles[2] * triangles[2]) {
                sb.append("right").append('\n');
            } else {
                sb.append("wrong").append('\n');
            }

            input = br.readLine();

        }

        System.out.println(sb);
    }
}
