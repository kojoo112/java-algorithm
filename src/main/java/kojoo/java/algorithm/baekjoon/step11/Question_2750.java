package kojoo.java.algorithm.baekjoon.step11;

import java.util.Arrays;
import java.util.Scanner;

public class Question_2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] temp = new int[sc.nextInt()];

        for(int i = 0; i < temp.length; i++) {
            temp[i] = sc.nextInt();
        }
        Arrays.sort(temp);

        for(int answer : temp) {
            System.out.println(answer);
        }
    }
}
