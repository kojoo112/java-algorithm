package kojoo.java.algorithm.programmers.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1Test {

    @Test
    void solution() {
        int[] arr1 = {4, 3, 2, 1};
        int[] arr2 = {10};

        Question1 question1 = new Question1();

        assertArrayEquals(new int[]{4, 3, 2}, question1.solution(arr1));
        assertArrayEquals(new int[]{-1}, question1.solution(arr2));

    }
}