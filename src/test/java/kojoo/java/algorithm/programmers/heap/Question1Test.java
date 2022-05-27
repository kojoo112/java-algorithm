package kojoo.java.algorithm.programmers.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1Test {

    @Test
    void solution() {
        Question1 question1 = new Question1();

        int[] scoville = {1,2,3,9,10,12};
        int k = 7;

        assertEquals(2, question1.solution(scoville, k));
    }
}