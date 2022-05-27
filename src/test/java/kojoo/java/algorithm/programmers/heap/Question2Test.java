package kojoo.java.algorithm.programmers.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question2Test {

    @Test
    void solution() {
        //n	vertex	return
        //6	{{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}}	3
        /*
        011000
        101100
        110101
        011000
        000000
        001000
         */

        Question2 question2 = new Question2();

        int n = 6;
        int[][] vertex = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};

        assertEquals(3, question2.solution(n, vertex));
    }
}