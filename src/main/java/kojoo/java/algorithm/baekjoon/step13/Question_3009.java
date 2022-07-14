package kojoo.java.algorithm.baekjoon.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] coordinates = new int[3][2];

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 2; j++) {
                coordinates[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int x, y;

        if (coordinates[0][0] == coordinates[1][0]) {
            x = coordinates[2][0];
        } else if (coordinates[0][0] == coordinates[2][0]) {
            x = coordinates[1][0];
        } else {
            x = coordinates[0][0];
        }

        if (coordinates[0][1] == coordinates[1][1]) {
            y = coordinates[2][1];
        } else if (coordinates[0][1] == coordinates[2][1]){
            y = coordinates[1][1];
        } else {
            y = coordinates[0][1];
        }

        System.out.println(x + " " + y);
    }
}
