package kojoo.java.algorithm.inflearn.step4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.next();
        String word2 = scanner.next();

        System.out.println(solution(word1, word2));
    }

    private static String solution(String word1, String word2) {
        String answer = "NO";

        Map<Character, Integer> wordMap1 = new HashMap<>();
        Map<Character, Integer> wordMap2 = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            wordMap1.put(word1.charAt(i), wordMap1.getOrDefault(word1.charAt(i), 0) + 1);
            wordMap2.put(word2.charAt(i), wordMap2.getOrDefault(word2.charAt(i), 0) + 1);
        }

        if (wordMap1.equals(wordMap2)) {
            return "YES";
        }


        return answer;
    }
}
