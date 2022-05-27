package kojoo.java.algorithm.inflearn.step4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char answer = ' ';
        int n = scanner.nextInt();
        String str = scanner.next();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }

        int max = Integer.MIN_VALUE;

        for (char key : map.keySet()) {
            if (max < map.get(key)) {
                max = map.get(key);
                answer = key;
            }
        }
        System.out.println(answer);
    }
}
