package kojoo.java.algorithm.programmers.dfs;

import java.util.Arrays;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class ConversionWord {

    int answer = 0;
    boolean[] visited;

    public int solution(String begin, String target, String[] words) {
        if (!Arrays.asList(words).contains(target)) {
            return 0;
        }
        visited = new boolean[words.length];

        dfs(begin, target, words, 0);

        return answer;
    }

    private void dfs(String begin, String target, String[] words, int count) {
        if (begin.equals(target)) {
            answer = count;
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (!visited[i]) {
                int differentNumberOfLetter = 0;
                for (int j = 0; j < begin.length(); j++) {
                    if (begin.charAt(j) == words[i].charAt(j)) {
                        differentNumberOfLetter++;
                    }
                }
                if (differentNumberOfLetter == begin.length() - 1) {
                    visited[i] = true;
                    dfs(words[i], target, words, count + 1);
                    visited[i] = false;
                }
            }
        }
    }

    public int solution2(String begin, String target, String[] words) {
        if (!Arrays.asList(words).contains(target)) {
            return 0;
        }

        Stack<Word> stack = new Stack<>();
        Set<String> used = new TreeSet<>();
        stack.push(new Word(begin, 0));

        while(!stack.isEmpty()) {
            Word now = stack.pop();
            String value = now.value;
            int depth = now.depth;

            if (value.equals(target)) {
                return depth;
            }
            for (String s : words) {
                if (isOneLetterDifferent(value, s) && !used.contains(s)) {
                    used.add(s);
                    stack.push(new Word(s, depth+1));
                }
            }
        }

        return 0;
    }

    private boolean isOneLetterDifferent(String now, String word) {
        int count = 0;
        for (int i = 0; i < now.length(); i++) {
            if (now.charAt(i) != word.charAt(i)) {
                count++;
            }
        }
        return count == 1;
    }
}
class Word {
    String value;
    int depth;

    public Word(String value, int depth) {
        this.value = value;
        this.depth = depth;
    }
}