package kojoo.java.algorithm.programmers.hash;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Camouflage {

    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> clothesMap = new HashMap<>();

        for (String[] clothe : clothes) {
            clothesMap.put(clothe[1], clothesMap.getOrDefault(clothe[1], 0) + 1);
        }

        for (String key : clothesMap.keySet()) {
            answer *= clothesMap.get(key) + 1;
        }

        return answer - 1;
    }
}
