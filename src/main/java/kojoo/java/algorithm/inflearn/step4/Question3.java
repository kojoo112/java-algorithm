package kojoo.java.algorithm.inflearn.step4;

import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();
        int checkDay = scanner.nextInt();

        int[] sales = new int[days];

        for (int i = 0; i < days; i++) {
            sales[i] = scanner.nextInt();
        }

        for (int answer: solution(days, checkDay, sales)) {
            System.out.print(answer + " ");
        }
    }

    private static int[] solution(int days, int checkDay, int[] sales) {
        int[] answer = new int[days - checkDay + 1];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < checkDay - 1; i++) {
            map.put(sales[i], map.getOrDefault(sales[i], 0 ) + 1);
        }

        int index = 0;
        for (int i = checkDay - 1; i < days; i++) {
            map.put(sales[i], map.getOrDefault(sales[i], 0) + 1);
            answer[index] = map.size();
            map.put(sales[index], map.get(sales[index]) - 1);
            if (map.get(sales[index]) == 0) {
                map.remove(sales[index]);
            }
            index++;
        }

        return answer;
    }
}
