package kojoo.java.algorithm.inflearn.step7;

public class Question2 {
    public static void main(String[] args) {
        solution(11);
    }

    private static void solution(int number) {
        if (number == 0) {
            return;
        } else {
            solution(number / 2);
            System.out.print(number % 2 + " ");
        }

    }
}
