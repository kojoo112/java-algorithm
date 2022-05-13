package kojoo.java.algorithm.programmers.lecture;

public class MaxIndex {

    public int[] solution(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int number : arr) {
            if (number > max) {
                max = number;
            }
        }
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                count++;
            }
        }

        int[] answer = new int[count];

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                answer[index++] = i;
            }
        }

        return answer;
    }
}
