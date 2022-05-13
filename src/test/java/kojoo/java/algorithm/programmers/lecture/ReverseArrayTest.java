package kojoo.java.algorithm.programmers.lecture;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseArrayTest {

    @Test
    void solution() {
        ReverseArray reverseArray = new ReverseArray();

        long n = 12345;

        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, reverseArray.solution(n));
    }
}