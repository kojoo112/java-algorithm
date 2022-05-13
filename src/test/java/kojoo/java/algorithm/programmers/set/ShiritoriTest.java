package kojoo.java.algorithm.programmers.set;

import org.junit.jupiter.api.Test;

class ShiritoriTest {

    @Test
    void solution() {
        Shiritori shiritori = new Shiritori();

        String[] input1 = {"tank", "kick", "know", "wheel", "land", "dream"};
        String[] input2 = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        System.out.println("1" + shiritori.solution(input2));
        System.out.println("2" + shiritori.solution(input1));
    }
}