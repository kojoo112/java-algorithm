package kojoo.java.algorithm.programmers.level3;

public class Triangle {
    int max = Integer.MIN_VALUE;

    public int solution(int[][] triangle) {
        int answer = 0;

        int sum = 0;
        dfs(triangle, sum, 0);
        return max;
    }

    private void dfs(int[][] triangle, int sum, int level) {
        if (level == triangle.length) {
            System.out.println(level);
            max = Math.max(max, sum);
        } else {


            for (int i = 0; i < triangle.length; i++) {
                for (int j = 0; j <= i; j++) {
                    dfs(triangle, sum + triangle[i][j], level + 1);
                }
            }
        }
    }
}
