package kojoo.java.algorithm.baekjoon;

import java.util.Scanner;

public class Question_2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int timeToCook = scanner.nextInt();

        minute = minute + timeToCook;

        if (minute > 59) {
            hour += minute / 60;
            minute = minute % 60;
        }

        if (hour > 23) {
            hour = hour - 24;
        }

        System.out.println(hour + " " + minute);

    }

}
