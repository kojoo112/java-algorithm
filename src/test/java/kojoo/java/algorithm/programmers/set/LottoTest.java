package kojoo.java.algorithm.programmers.set;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LottoTest {

    @Test
    void solution() {
        int[] input1 = {4, 7, 32, 43, 22, 19};
        int[] input2 = {3, 19, 34, 39, 39, 20};

        Lotto lotto = new Lotto();

        assertTrue(lotto.solution(input1));
        assertFalse(lotto.solution(input2));
    }
}