package kojoo.java.algorithm.baekjoon;

import java.io.*;

public class Question_15552 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(bufferedReader.readLine());

            for (int i = 0; i < n; i++) {
                String line = bufferedReader.readLine();
                int a = Integer.parseInt(line.split(" ")[0]);
                int b = Integer.parseInt(line.split(" ")[1]);

                bufferedWriter.write(String.valueOf(a + b));
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
    }
}
