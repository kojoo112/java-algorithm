package kojoo.java.algorithm.programmers.lecture;

import java.util.Arrays;

public class PermutationCheck {

    public boolean solution(int[] arr) {
        boolean answer = true;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (i + 1 != arr[i]) return false;
        }

        return answer;
    }
}
