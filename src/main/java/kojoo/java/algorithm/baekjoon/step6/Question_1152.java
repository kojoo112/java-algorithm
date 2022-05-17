package kojoo.java.algorithm.baekjoon.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = bufferedReader.readLine().strip();

        if (input.isBlank()){
            System.out.println(0);
        } else {
            System.out.println(input.split(" ").length);
        }
    }
}
