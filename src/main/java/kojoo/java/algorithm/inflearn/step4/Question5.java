package kojoo.java.algorithm.inflearn.step4;

import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int order = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println(solution(n, order, numbers));
    }

    private static int solution(int n, int order, int[] numbers) {
        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    set.add((numbers[i] + numbers[j] + numbers[k]));
                }
            }
        }

        if (order > set.size()) {
            return -1;
        }

        return set.stream().mapToInt(Integer::intValue).toArray()[order - 1];
    }
}
