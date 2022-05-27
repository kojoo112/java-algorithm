package kojoo.java.algorithm.inflearn.step1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question2Test {

    @Test
    void solution() {
        Question2 question2 = new Question2();

        String input = "StuDY";

        assertEquals("sTUdy", question2.solution(input));
    }
}