package kojoo.java.algorithm.programmers.dfs;

import java.util.Arrays;

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
}
