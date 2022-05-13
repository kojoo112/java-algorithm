package kojoo.java.algorithm.programmers.hash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IncompleteRunnerTest {


    @Test
    void solution() {
        IncompleteRunner incompleteRunner = new IncompleteRunner();

        String[] participant1 = {"leo", "kiki", "eden"};
        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};

        String[] completion1 = {"eden", "kiki"};
        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
        String[] completion3 = {"stanko", "ana", "mislav"};

        String solution1 = incompleteRunner.solution(participant1, completion1);
        String solution2 = incompleteRunner.solution(participant2, completion2);
        String solution3 = incompleteRunner.solution(participant3, completion3);

        assertEquals("leo", solution1);
        assertEquals("vinko", solution2);
        assertEquals("mislav", solution3);
    }
}