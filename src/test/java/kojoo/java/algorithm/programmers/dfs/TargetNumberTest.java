package kojoo.java.algorithm.programmers.dfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TargetNumberTest {

    @Test
    void solution() {
        TargetNumber targetNumber = new TargetNumber();

        int[] numbers1 = {1, 1, 1, 1, 1};
        int[] numbers2 = {4, 1, 2, 1};

        int target1 = 3;
        int target2 = 4;

//        assertEquals(5, targetNumber.solution(numbers1, target1));

        assertEquals(2, targetNumber.solution(numbers2, target2));

    }
}