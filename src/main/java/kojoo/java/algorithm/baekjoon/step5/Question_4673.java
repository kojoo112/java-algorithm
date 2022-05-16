package kojoo.java.algorithm.baekjoon.step5;

public class Question_4673 {
    public static void main(String[] args) {
        boolean[] check = new boolean[10000];

        for (int i = 0; i < 10001; i++) {
            int n = d(i);

            if (n < 10000) {
                check[n] = true;
            }
        }

        for (int i = 1; i < 10000; i++) {
            if (!check[i]) {
                System.out.println(i);
            }
        }
    }

    private static int d(int number) {
        int sum = number;

        while(number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
