package kojoo.java.algorithm.inflearn.step7;

public class Question6 {
    static int n;
    static  int[] check;

    public static void main(String[] args) {
        n = 3;
        check = new int[n+1];
        solution(1);
    }

    private static void solution(int depth) {
        StringBuilder temp = new StringBuilder();
        if (depth == n + 1) {
            for (int i = 1; i <= n; i++) {
                if (check[i] == 1) {
                    temp.append(i).append(" ");
                }
            }
            if (temp.length() > 0) {
                System.out.println(temp);
            }
        } else {
            check[depth] = 1;
            solution(depth + 1);
            check[depth] = 0;
            solution(depth + 1);
        }
    }
}
