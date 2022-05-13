package kojoo.java.algorithm.programmers.map;

import java.util.HashSet;
import java.util.Set;

public class Pokémon {

    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> pokemonSet = new HashSet<>();

        for (int num : nums) {
            pokemonSet.add(num);
        }

        int selectCount = nums.length / 2;

        if (pokemonSet.size() >= selectCount) {
            return selectCount;
        } else {
            return pokemonSet.size();
        }

    }
}
