package kojoo.java.algorithm.programmers.set;

import java.util.ArrayList;
import java.util.List;

public class Question_3 {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        int last = -1;
        for (int element : arr) {
            if (last != element) {
                list.add(element);
                last = element;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();

    }
}
