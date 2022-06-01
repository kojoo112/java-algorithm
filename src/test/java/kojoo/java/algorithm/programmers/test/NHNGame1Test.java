package kojoo.java.algorithm.programmers.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NHNGame1Test {

    
    //maze	queries	result
    //{"AAAAA", "AABBB", "CAEFG", "AAEFF"}	{"1 1 1 5 AF", "1 1 4 5 AF", "2 1 4 5 FAE", "1 5 4 5 ABF", "1 1 4 1 A"}	{5, -1, 7, 6, 6}
    //{"AAA", "ABB", "ABA"}	{"1 1 1 3 A", "1 3 3 1 A", "1 1 3 3 A", "1 1 3 3 AB"}	{3, 5, -1, 5}
    @Test
    void solution() {
        NHNGame3 nhnGame1 = new NHNGame3();

        String[] maze1 = {"AAAAA", "AABBB", "CAEFG", "AAEFF"};
        String[] maze2 = {"AAA", "ABB", "ABA"};

        String[] queries1 = {"1 1 1 5 AF", "1 1 4 5 AF", "2 1 4 5 FAE", "1 5 4 5 ABF", "1 1 4 1 A"};
        String[] queries2 = {"1 1 1 3 A", "1 3 3 1 A", "1 1 3 3 A", "1 1 3 3 AB"};

        assertArrayEquals(new int[]{5, -1, 7, 6, 6}, nhnGame1.solution(maze1, queries1));
        assertArrayEquals(new int[]{3, 5, -1, 5}, nhnGame1.solution(maze2, queries2));

    }

    // 한 라운드에서 두 플레이어가 받은 카드 10장 중에서 중복되는 번호가 있는 경우
    // 한 플레이어가 직전 라운드에서 받은 카드 5장과 이번 라운드에서 받은 카드 5장을 비교했을 때, 중복되는 번호가 2개 이상 있는 경우
    // cards1	cards2	result
    // [[1, 2, 3, 4, 5], [6, 7, 8, 9, 10]]	[[5, 7, 9, 11, 13], [11, 13, 15, 17, 19]]	2
    // [[13, 21, 24, 29, 50], [1, 12, 20, 21, 32], [16, 26, 34, 46, 52], [9, 11, 16, 16, 21], [3, 8, 10, 16, 20]]	[[5, 10, 15, 41, 49], [6, 14, 15, 19, 46], [5, 42, 43, 51, 52], [5, 6, 11, 13, 45], [5, 9, 11, 13, 45]]	3
    @Test
    void testSolution() {
        int[][] card1 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        int[][] card2 = {{5, 7, 9, 11, 13}, {11, 13, 15, 17, 19}};

        int[][] card1_2 = {{13, 21, 24, 29, 50}, {1, 12, 20, 21, 32}, {16, 26, 34, 46, 52}, {9, 11, 16, 16, 21}, {3, 8, 10, 16, 20}};
        int[][] card2_2 = {{5, 10, 15, 41, 49}, {6, 14, 15, 19, 46}, {5, 42, 43, 51, 52}, {5, 6, 11, 13, 45}, {5, 9, 11, 13, 45}};
        NHNGame1 nhnGame1 = new NHNGame1();

        assertEquals(2, nhnGame1.solution(card1, card2));
        assertEquals(3, nhnGame1.solution(card1_2, card2_2));
    }
}