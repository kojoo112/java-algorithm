package kojoo.java.algorithm.programmers.map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PokémonTest {

    @Test
    void solution() {
        int[] nums1 = {3, 1, 2, 3};
        int[] nums2 = {3, 3, 3, 2, 2, 4};
        int[] nums3 = {3, 3, 3, 2, 2, 2};

        Pokémon pokemon = new Pokémon();

        Assertions.assertEquals(2, pokemon.solution(nums1));
        Assertions.assertEquals(3, pokemon.solution(nums2));
        Assertions.assertEquals(2, pokemon.solution(nums3));
    }
}