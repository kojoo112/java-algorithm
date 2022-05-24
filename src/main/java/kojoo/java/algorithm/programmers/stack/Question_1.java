package kojoo.java.algorithm.programmers.stack;

public class Question_1 {
    public boolean solution(String s) {
        int stack = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack++;
            } else {
                if (stack == 0) return false;
                stack--;
            }
        }

        return stack == 0;
    }
}
