package kojoo.java.algorithm.programmers.set;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question_3Test {

    @Test
    void solution() {
        Question_3 question3 = new Question_3();
        int[] input1 = {1, 1, 3, 3, 0, 1, 1};
        int[] input2 = {4, 4, 4, 3, 3};

        assertArrayEquals(new int[]{1, 3, 0, 1}, question3.solution(input1));
        assertArrayEquals(new int[]{4, 3}, question3.solution(input2));

    }
}