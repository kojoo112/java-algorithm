package kojoo.java.algorithm.programmers.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question2Test {

    @Test
    void solution() {
        String[] strings1 = {"sun", "bed", "car"};
        String[] strings2 = {"abce", "abcd", "cdx"};

        int n1 = 1;
        int n2 = 2;

        Question2 question2 = new Question2();

        assertArrayEquals(new String[] {"car", "bed", "sun"}, question2.solution(strings1, n1));
        assertArrayEquals(new String[] {"abcd", "abce", "cdx"}, question2.solution(strings2, n2));

    }
}