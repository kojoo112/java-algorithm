package kojoo.java.algorithm.programmers.sort;

public class Question3 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        char last = ' ';
        for (char c : s.toCharArray()) {
            if (last == ' ') {
                c = Character.toUpperCase(c);
            }
            sb.append(c);
            last = c;
        }
        return sb.toString();
    }
}
