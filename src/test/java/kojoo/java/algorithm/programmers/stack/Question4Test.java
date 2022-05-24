package kojoo.java.algorithm.programmers.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question4Test {

    @Test
    void solution() {
        Question4 question4 = new Question4();

        int[] priorities1 = {2, 1, 3, 2};
        int[] priorities2 = {1, 1, 9, 1, 1};

        int location1 = 2;
        int location2 = 0;

        assertEquals(1, question4.solution(priorities1, location1));
        assertEquals(5, question4.solution(priorities1, location2));
    }
}