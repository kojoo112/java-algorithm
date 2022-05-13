package kojoo.java.algorithm.programmers.dfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShortestDistanceTest {

    @Test
    void solution() {
        ShortestDistance shortestDistance = new ShortestDistance();

        int[][] maps1 = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        int[][] maps2 = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {0, 0, 0, 0, 1}};


        assertEquals(11, shortestDistance.solution(maps1));
//        assertEquals(-1, shortestDistance.solution(maps2));
    }
}