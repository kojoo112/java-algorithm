package kojoo.java.algorithm.baekjoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            int height = Integer.parseInt(stringTokenizer.nextToken());
            int width = Integer.parseInt(stringTokenizer.nextToken());
            int customer = Integer.parseInt(stringTokenizer.nextToken());

            int roomNumber = 0;
            int floor = 0;

            if (customer % height == 0) {
                floor = height;
                roomNumber = customer / height;
            } else {
                floor = customer % height;
                roomNumber = customer / height + 1;
            }

            System.out.println(floor * 100 + roomNumber);
        }
    }
}
