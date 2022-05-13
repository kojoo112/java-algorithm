package kojoo.java.algorithm.programmers.lecture;

public class ReverseArray {

    public int[] solution(long n) {
        String input = String.valueOf(n);
        int[] answer = new int[input.length()];

        for (int i = 0; i < input.length(); i++) {
            answer[i] = (int) (n % 10);
            n = n / 10;
        }

        return answer;
    }
}
