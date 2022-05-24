package kojoo.java.algorithm.programmers.set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShiritoriTest {

    @Test
    void solution() {
        Shiritori shiritori = new Shiritori();
        String[] input1 = {"tank", "kick", "know", "wheel", "land", "dream"};
        String[] input2 = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};

        Assertions.assertTrue(shiritori.solution(input1));
        Assertions.assertFalse(shiritori.solution(input2));
    }
}