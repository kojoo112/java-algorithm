package kojoo.java.algorithm.programmers.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question_1Test {

    @Test
    void solution() {
        int[][] atmos1 = {{80, 35}, {70, 38}, {100, 41}, {75, 30}, {160, 80}, {77, 29}, {181, 68}, {151, 76}};
        int[][] atmos2 = {{140, 90}, {177, 75}, {95, 45}, {71, 31}, {150, 30}, {80, 35}, {72, 33}, {166, 81}, {151, 75}};
        int[][] atmos3 = {{30, 15}, {80, 35}};

        Question_1 question1 = new Question_1();

        assertEquals(3, question1.solution(atmos1));
        assertEquals(4, question1.solution(atmos2));
        assertEquals(0, question1.solution(atmos3));
    }
}