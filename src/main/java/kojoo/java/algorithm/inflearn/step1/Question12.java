package kojoo.java.algorithm.inflearn.step1;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String input = scanner.next();

        System.out.println(solution(n, input));
    }

    private static String solution(int n, String input) {
        String answer = "";
        String[] password = new String[n];

        for (int i = 0; i < n; i++) {
            password[i] = input.substring(i * 7, i * 7 + 7).replace("#", "1").replace("*", "0");
            int letter = Integer.parseInt(password[i], 2);
            answer += (char) letter;
        }

        return answer;
    }
}
