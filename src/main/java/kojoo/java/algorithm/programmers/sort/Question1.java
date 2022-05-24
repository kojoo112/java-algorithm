package kojoo.java.algorithm.programmers.sort;

import java.util.ArrayList;
import java.util.List;

public class Question1 {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int index = 0;

        if (arr.length == 0) {
            return new int[]{-1};
        }
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        list.remove(index);
        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
