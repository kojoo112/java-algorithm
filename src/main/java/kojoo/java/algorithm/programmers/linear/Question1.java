package kojoo.java.algorithm.programmers.linear;

import java.util.*;

public class Question1 {
    public boolean solution(String[] phone_book) {
        List<Integer> list = new ArrayList<>();

        int i1 = Collections.binarySearch(list, 2);
        boolean answer = true;

        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length -1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }

        return answer;
    }
}
