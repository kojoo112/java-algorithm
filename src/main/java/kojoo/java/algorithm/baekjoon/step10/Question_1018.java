package kojoo.java.algorithm.baekjoon.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question_1018 {
    static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean[][] chessboard = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                if (line.charAt(j) == 'W') {
                    chessboard[i][j] = true;
                }
            }
        }

        int row = n - 7;
        int column = m - 7;
        int answer = 64;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                find(i, j, chessboard);
            }
        }

        System.out.println(Math.min(min, answer));

    }

    private static void find(int row, int column, boolean[][] chessboard) {
        int endRow = row + 8;
        int endColumn = column + 8;
        int count = 0;

        boolean color = chessboard[row][column];

        for (int i = row; i < endRow; i++) {
            for (int j = column; j < endColumn; j++) {
                if (chessboard[i][j] != color) {
                    count++;
                }
                color = !color;
            }
            color = !color;
        }

        count = Math.min(count, 64 - count);

        min = Math.min(min, count);
    }
}
