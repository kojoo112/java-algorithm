package kojoo.java.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Question_11022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <n - (n - i) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(bufferedReader.readLine());
//
//        for (int i = 1; i <= n; i++) {
//            String line = bufferedReader.readLine();
//            int a = Integer.parseInt(line.split(" ")[0]);
//            int b = Integer.parseInt(line.split(" ")[1]);
//            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a + b));
//
//        }
//    }
}
