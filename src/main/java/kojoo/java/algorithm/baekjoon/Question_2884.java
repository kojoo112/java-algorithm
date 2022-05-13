package kojoo.java.algorithm.baekjoon;

import java.util.Scanner;

public class Question_2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        if (minute < 45) {
            hour--;
            minute = minute + 15;
        } else {
            minute -= 45;
        }

        if (hour == -1) {
            hour = 23;
        }

        System.out.println(hour + " " + minute);
    }
}
