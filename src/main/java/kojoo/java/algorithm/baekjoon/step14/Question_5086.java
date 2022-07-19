package kojoo.java.algorithm.baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();

        while (!input.equals("0 0")) {
            String[] inputs = input.split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);

            if (b % a == 0) {
                sb.append("factor").append('\n');
            } else if (a % b == 0) {
                sb.append("multiple").append('\n');
            } else {
                sb.append("neither").append('\n');
            }
            input = br.readLine();
        }

        System.out.println(sb);

    }
}
