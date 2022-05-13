package kojoo.java.algorithm.programmers.dfs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NetworkTest {

    @Test
    void solution() {
        Network network = new Network();

        int n = 3;
        int[][] computers1 = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        int[][] computers2 = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};


        int solution1 = network.solution(n, computers1);
        int solution2 = network.solution(n, computers2);

        Assertions.assertEquals(2, solution1);
        Assertions.assertEquals(1, solution2);
    }
}