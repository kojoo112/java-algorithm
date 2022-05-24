package kojoo.java.algorithm.programmers.linear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question3Test {

    @Test
    void solution() {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};

        Question3 question3 = new Question3();

        assertEquals(2, question3.solution(skill, skill_trees));
    }
}