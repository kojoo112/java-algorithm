package kojoo.java.algorithm.programmers.heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class Question1 {

    // 섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
    public int solution(int[] scoville, int K) {
        int answer = 0;

        Queue<Integer> queue = new PriorityQueue<>();
        for (int j : scoville) {
            queue.offer(j);
        }

        int mixedScoville = 0;
        while(!queue.isEmpty()) {
            if (queue.peek() >= K) {
                return answer;
            }
            answer++;
            if (queue.size() > 1) {
                mixedScoville = queue.poll() + queue.poll() * 2;
            } else {
                return -1;
            }
            queue.offer(mixedScoville);
        }

        return answer;
    }
}
