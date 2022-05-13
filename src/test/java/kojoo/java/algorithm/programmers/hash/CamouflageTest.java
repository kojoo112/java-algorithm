package kojoo.java.algorithm.programmers.hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CamouflageTest {

    @Test
    void solution() {
        String[][] clothes1 = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] clothes2 = {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};

        Camouflage camouflage = new Camouflage();

        Assertions.assertEquals(5, camouflage.solution(clothes1));
        Assertions.assertEquals(3, camouflage.solution(clothes2));
    }
}