package kojoo.java.algorithm.inflearn.step1;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String[] input = new String[n];
        for (int i = 0; i < n; i++) {
            input[i] = scanner.next();
        }

        for (String str: solution(input)) {
            System.out.println(str);
        }
    }

    private static String[] solution(String[] input) {
        String[] answer = new String[input.length];

        for (int i = 0; i < input.length; i++) {
            String str = input[i];
            StringBuilder temp = new StringBuilder();
            for (int j = str.length() - 1; j >= 0; j--) {
                temp.append(str.charAt(j));
            }
            answer[i] = temp.toString();
        }
        return answer;
    }
}
