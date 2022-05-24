package kojoo.java.algorithm.programmers.linear;

public class Question2 {
    public boolean solution(String s) {
        boolean answer = true;

        int count = 0;
        s = s.toLowerCase();
        for (char c : s.toCharArray()) {
            if (c == 'p') {
                count++;
            } else if (c == 'y') {
                count--;
            }
        }
        return count == 0;
    }
}
