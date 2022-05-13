package kojoo.java.algorithm.programmers.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Shiritori {
    public boolean solution(String[] words) {
        boolean answer = true;

        Set<String> wordSet = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            Collections.addAll(wordSet, words);
        }

        if (wordSet.size() != words.length) {
            return false;
        }

        return answer;
    }
}
