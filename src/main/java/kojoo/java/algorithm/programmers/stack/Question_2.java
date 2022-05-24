package kojoo.java.algorithm.programmers.stack;


import java.util.LinkedList;
import java.util.Queue;

public class Question_2 {
    public int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            double progress = progresses[i];
            double speed = speeds[i];
            int days = (int) Math.ceil((100 - progress) / speed);
            queue.offer(days);
        }

        Queue<Integer> answer = new LinkedList<>();

        int max = queue.poll();
        int count = 1;

        while (!queue.isEmpty()) {
            int task = queue.poll();
            if (max >= task) {
                count++;
                continue;
            }
                answer.offer(count);
                count = 1;
                max = task;
        }
        answer.offer(count);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
