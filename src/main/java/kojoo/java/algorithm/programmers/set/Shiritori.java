package kojoo.java.algorithm.programmers.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Shiritori {
    public boolean solution(String[] words) {
        boolean answer = true;

        for (int i = 0; i < words.length - 1; i++) {
            char first = words[i].charAt(words[i].length() - 1);
            if (first != words[i + 1].charAt(0)) {
                return false;
            }
        }

        Set<String> wordSet = new HashSet<>(List.of(words));

        return wordSet.size() == words.length;
    }
}
