package kojoo.java.algorithm.programmers.lecture;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MaxIndexTest {

    @Test
    void solution() {
        MaxIndex maxIndex = new MaxIndex();

        int[] input1 = {1, 3, 5, 4, 5, 2, 1};
        int[] input2 = {3, 6, 10, 1, 7, 2, 4, 6, 10, 9};

        assertArrayEquals(new int[]{2, 4}, maxIndex.solution(input1));
        assertArrayEquals(new int[]{2, 8}, maxIndex.solution(input2));
    }
}