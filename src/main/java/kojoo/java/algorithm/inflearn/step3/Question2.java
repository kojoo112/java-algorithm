package kojoo.java.algorithm.inflearn.step3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextInt();
        }
        scanner.close();

        for (int answer : solution(n, m, arr1, arr2)) {
            System.out.print(answer + " ");
        }

    }

    private static int[] solution(int n, int m, int[] arr1, int[] arr2) {
        List<Integer> answer = new LinkedList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int position1 = 0;
        int position2 = 0;

        while (position1 < n && position2 < m) {
            if (arr1[position1] == arr2[position2]) {
                answer.add(arr1[position1++]);
                position2++;
            } else if (arr1[position1] < arr2[position2]) {
                position1++;
            } else {
                position2++;
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
