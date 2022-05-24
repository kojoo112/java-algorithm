package kojoo.java.algorithm.programmers.linear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question2Test {

    @Test
    void solution() {
        String s1 = "pPoooyY";
        String s2 = "Pyy";

        Question2 question2 = new Question2();

        assertTrue(question2.solution(s1));
        assertFalse(question2.solution(s2));
    }
}