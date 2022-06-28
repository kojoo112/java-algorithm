package kojoo.java.algorithm.programmers.sk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SKTelecom_2Test {

    @Test
    void solution() {

        int[] periods1 = {20, 23, 24};
        int[] periods2 = {24, 59, 59, 60};

        int[][] payments1 = {{100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000}, {100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000}, {350000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000}};
        int[][] payments2 = {{50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000}, {50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000}, {350000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000}, {50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000}};

        int[] estimates1 = {100000, 100000, 100000};
        int[] estimates2 = {350000, 50000, 40000, 50000};

        SKTelecom_2 skTelecom2 = new SKTelecom_2();

        assertArrayEquals(new int[] {1, 1}, skTelecom2.solution(periods1, payments1, estimates1));
        assertArrayEquals(new int[] {2, 1}, skTelecom2.solution(periods2, payments2, estimates2));
    }
}