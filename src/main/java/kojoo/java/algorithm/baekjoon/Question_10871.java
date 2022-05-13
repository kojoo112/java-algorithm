package kojoo.java.algorithm.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Question_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = bufferedReader.readLine();

        int n = Integer.parseInt(line.split(" ")[0]);
        int x = Integer.parseInt(line.split(" ")[1]);

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(stringTokenizer.nextToken());
            if (number < x) {
                bufferedWriter.write(number + " ");
            }
        }
        bufferedWriter.flush();
    }
}
