package kojoo.java.algorithm.baekjoon.step5;

public class Question_15596 {
    private long sum(int[] a) {
        long answer = 0;
        for (int j : a) {
            answer += j;
        }

        return answer;
    }
}
