package kojoo.java.algorithm.programmers.level3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void solution() {
        Triangle triangle = new Triangle();

        int[][] triangles = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};

        assertEquals(30, triangle.solution(triangles));
    }
}