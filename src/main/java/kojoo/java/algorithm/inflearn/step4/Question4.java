package kojoo.java.algorithm.inflearn.step4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();

        System.out.println(solution(s, t));
    }

    private static int solution(String s, String t) {
        int answer = 0;

        Map<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }

        Map<Character, Integer> sMap = new HashMap<>();

        for (int i = 0; i < t.length() - 1; i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        int index = 0;
        for (int i = t.length() - 1; i < s.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            if (sMap.equals(tMap)) {
                answer++;
            }
            sMap.put(s.charAt(index), sMap.get(s.charAt(index)) - 1);
            if (sMap.get(s.charAt(index)) == 0) {
                sMap.remove(s.charAt(index));
            }
            index++;
        }

        return answer;
    }
}
