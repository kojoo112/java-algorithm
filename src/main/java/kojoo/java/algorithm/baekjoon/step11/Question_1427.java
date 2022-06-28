package kojoo.java.algorithm.baekjoon.step11;

import java.util.*;

public class Question_1427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        List<Integer> list = new LinkedList<>();

        for (char c : input.toCharArray()) {
            list.add(c - 48);
        }

        list.sort(Comparator.reverseOrder());

        for (int answer : list) {
            System.out.print(answer);
        }
    }
}
