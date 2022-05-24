package kojoo.java.algorithm.programmers.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question3Test {

    @Test
    void solution() {
        String s1 = "3people unFollowed me";
        String s2 = "for the last week";

        Question3 question3 = new Question3();

        assertEquals("3people Unfollowed Me", question3.solution(s1));
        assertEquals("For The Last Week", question3.solution(s2));
    }
}