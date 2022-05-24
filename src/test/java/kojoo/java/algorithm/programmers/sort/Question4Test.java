package kojoo.java.algorithm.programmers.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question4Test {

    @Test
    void solution() {
        int[] citations = {3, 0, 6, 1, 5};

        Question4 question4 = new Question4();

        assertEquals(3, question4.solution(citations));
    }
}