package kojoo.java.algorithm.programmers.sort;

import java.util.*;

public class Question2 {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        Map<String, Character> map = new TreeMap<>();

        for (String s : strings) {
            map.put(s, s.charAt(n));
        }

        List<Map.Entry<String, Character>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue());

        int index = 0;
        for (Map.Entry<String, Character> entry : entryList) {
            answer[index++] = entry.getKey();
        }

        return answer;
    }

    public String[] solution2(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            if (s1.charAt(n) == s2.charAt(n)) {
                return s1.compareTo(s2);
            } else {
                return s1.charAt(n) - s2.charAt(n);
            }
        });

        return strings;
    }
}
