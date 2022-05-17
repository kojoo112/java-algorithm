package kojoo.java.algorithm.baekjoon.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < n; i++) {
            String input = bufferedReader.readLine();
            int loopCount = Integer.parseInt(input.split(" ")[0]);
            String loopContent = input.split(" ")[1];
            for (int j = 0; j < loopContent.length(); j++) {
                for (int k = 0; k < loopCount; k++) {
                    System.out.print(loopContent.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
