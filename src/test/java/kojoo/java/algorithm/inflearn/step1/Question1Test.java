package kojoo.java.algorithm.inflearn.step1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1Test {

    @Test
    void solution() {
        Question1 question1 = new Question1();

        String input = "Computercooler";
        char letter = 'c';

        assertEquals(2, question1.solution(input, letter));
    }
}