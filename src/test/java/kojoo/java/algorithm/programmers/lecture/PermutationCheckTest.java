package kojoo.java.algorithm.programmers.lecture;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermutationCheckTest {

    @Test
    void solution() {
        PermutationCheck permutationCheck = new PermutationCheck();
        int[] input1 = {4,1,3,2};
        int[] input2 = {4,1,3};

        assertEquals(true, permutationCheck.solution(input1));
        assertEquals(false, permutationCheck.solution(input2));
    }
}