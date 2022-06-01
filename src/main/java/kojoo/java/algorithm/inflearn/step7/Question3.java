package kojoo.java.algorithm.inflearn.step7;

public class Question3 {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    private static int solution(int number) {
        if (number == 1) {
            return 1;
        } else {
            return (solution(number - 1) * number);
        }
    }
}
