package kojoo.java.algorithm.inflearn.step2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] input = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextInt();
        }

        for (int answer : solution(input)) {
            System.out.print(answer + " ");
        }

    }

    private static int[] solution(int[] input) {
        List<Integer> list = new LinkedList<>();
        list.add(input[0]);
        for (int i = 1; i < input.length; i++) {
            if (input[i - 1] < input[i]) {
                list.add(input[i]);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
