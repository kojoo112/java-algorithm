package kojoo.java.algorithm.inflearn.step3;

import java.util.Scanner;

public class Question1 {
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

        for (int answer : solution(n, m, arr1, arr2)) {
            System.out.print(answer + " ");
        }
    }

    private static int[] solution(int n, int m, int[] arr1, int[] arr2) {
        int[] answer = new int[n + m];

        int position1 = 0;
        int position2 = 0;
        int index = 0;
        while (position1 < n && position2 < m) {
            if (arr1[position1] <= arr2[position2]) {
                answer[index++] = arr1[position1++];
            } else {
                answer[index++] = arr2[position2++];
            }
        }
        while(position1 < n) {
            answer[index++] = arr1[position1++];
        }
        while(position2 < m) {
            answer[index++] = arr2[position2++];
        }

        return answer;
    }
}
