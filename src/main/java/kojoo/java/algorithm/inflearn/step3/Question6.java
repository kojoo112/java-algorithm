package kojoo.java.algorithm.inflearn.step3;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int changeChance = scanner.nextInt();
        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println(solution(length, changeChance, numbers));
    }

    private static int solution(int length, int changeChance, int[] numbers) {
        int answer = 0;
        int index = 0;
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (numbers[i] == 0) {
                count++;
            }
            while (count > changeChance) {
                if (numbers[index] == 0) {
                    count--;
                }
                index++;
            }
            answer = Math.max(answer, i - index + 1);
        }

        return answer;
    }
}
