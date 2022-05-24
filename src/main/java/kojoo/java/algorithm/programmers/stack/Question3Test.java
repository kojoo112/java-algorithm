package kojoo.java.algorithm.programmers.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question3Test {

    @Test
    void solution() {
        Question3 question3 = new Question3();
        int[] prices = {1, 2, 3, 2, 3};

        assertArrayEquals(new int[]{4, 3, 1, 1, 0}, question3.solution(prices));
    }
}