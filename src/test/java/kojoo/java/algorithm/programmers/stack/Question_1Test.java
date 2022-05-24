package kojoo.java.algorithm.programmers.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question_1Test {

    @Test
    void solution() {
        Question_1 question1 = new Question_1();
        String input1 = "()()";
        String input2 = "(())()";
        String input3 = ")()(";
        String input4 = "(()(";

        assertTrue(question1.solution(input1));
        assertTrue(question1.solution(input2));
        assertFalse(question1.solution(input3));
        assertFalse(question1.solution(input4));
    }
}