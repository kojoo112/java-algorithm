package kojoo.java.algorithm.baekjoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int up = Integer.parseInt(stringTokenizer.nextToken());
        int down = Integer.parseInt(stringTokenizer.nextToken());
        int length = Integer.parseInt(stringTokenizer.nextToken());


        int day = (length - down) / (up - down);
        if ((length - down) % (up - down) != 0) {
            day++;
        }
        System.out.println(day);
    }
}
