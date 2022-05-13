package kojoo.java.algorithm.programmers.set;

import java.util.HashSet;
import java.util.Set;

public class Lotto {
    public boolean solution(int[] lotto) {
        boolean answer = true;
        Set<Integer> lottoSet = new HashSet<>();

        for (int number : lotto) {
            lottoSet.add(number);
        }

        if (lottoSet.size() != lotto.length) {
            return false;
        }

        return answer;
    }
}
