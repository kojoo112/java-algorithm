package kojoo.java.algorithm.inflearn.step7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Question8 {
    static int[] distance = {1, -1, 5};
    static int[] check;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int location = scanner.nextInt();
        int target = scanner.nextInt();

        System.out.println(solution(location, target));
    }

    private static int solution(int location, int target) {
        Queue<Integer> queue = new LinkedList<>();
        check = new int[10001];
        check[location] = 1;
        queue.offer(location);
        int depth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int now = queue.poll();
                for (int j = 0; j < 3; j++) {
                    int move = now + distance[j];
                    if (move == target) {
                        return depth + 1;
                    }
                    if (move >= 1 && move <= 10000 && check[move] == 0) {
                        check[move] = 1;
                        queue.offer(move);
                    }
                }
            }
            depth++;
        }

        return depth;
    }
}
