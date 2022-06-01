package kojoo.java.algorithm.programmers.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NHNGame2Test {

    //balance	transaction	abnormal	result
    //{30, 30, 30, 30}	{{1, 2, 10}, {2, 3, 20}, {3, 4, 5}, {3, 4, 30}}	{1}	{0, 20, 15, 55}
    //{30, 30, 30, 30}	{{1, 2, 10}, {2, 3, 20}, {3, 4, 5}, {3, 4, 30}}	{2, 3}	{20, 0, 0, 40}
    //{40, 30, 50}	{{1, 3, 20}, {2, 1, 10}, {3, 1, 45}, {2, 3, 10}, {1, 3, 35}, {2, 1, 5}, {3, 1, 10}, {3, 2, 5}}	{2}	{40, 5, 45}
    //{100, 1, 1, 1, 1}	{{1, 2, 100}, {2, 3, 101}, {3, 4, 102}, {4, 5, 103}, {5, 1, 104}}	{1}	{4, 0, 0, 0, 0}
    @Test
    void solution() {
        int[] balance1 ={30, 30, 30, 30};
        int[] balance2 ={30, 30, 30, 30};
        int[] balance3 ={40, 30, 50};
        int[] balance4 ={100, 1, 1, 1, 1};

        int[][] transaction1 = {{1, 2, 10}, {2, 3, 20}, {3, 4, 5}, {3, 4, 30}};
        int[][] transaction2 = {{1, 2, 10}, {2, 3, 20}, {3, 4, 5}, {3, 4, 30}};
        int[][] transaction3 = {{1, 3, 20}, {2, 1, 10}, {3, 1, 45}, {2, 3, 10}, {1, 3, 35}, {2, 1, 5}, {3, 1, 10}, {3, 2, 5}};
        int[][] transaction4 = {{1, 2, 100}, {2, 3, 101}, {3, 4, 102}, {4, 5, 103}, {5, 1, 104}};

        int[] abnormal1 = {1};
        int[] abnormal2 = {2, 3};
        int[] abnormal3 = {2};
        int[] abnormal4 = {1};

        NHNGame2 nhnGame2 = new NHNGame2();
        assertArrayEquals(new int[]{0, 20, 15, 55}, nhnGame2.solution(balance1, transaction1, abnormal1));
        assertArrayEquals(new int[]{20, 0, 0, 40}, nhnGame2.solution(balance2, transaction2, abnormal2));
        assertArrayEquals(new int[]{40, 5, 45}, nhnGame2.solution(balance3, transaction3, abnormal3));
        assertArrayEquals(new int[]{4, 0, 0, 0, 0}, nhnGame2.solution(balance4, transaction4, abnormal4));
    }
}