package kojoo.java.algorithm.programmers.sort;

import java.util.Arrays;

public class Question4 {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        // 0, 1, 3, 5, 6
        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;
            if (citations[i] >= h) {
                return h;
            }
        }

        return 0;
    }
}
