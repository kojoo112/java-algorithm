package kojoo.java.algorithm.programmers.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question_2Test {

    //progresses	speeds	return
    //[93, 30, 55]	[1, 30, 5]	[2, 1]
    //[95, 90, 99, 99, 80, 99]	[1, 1, 1, 1, 1, 1]	[1, 3, 2]

    @Test
     void solution() {
        Question_2 question2 = new Question_2();

        int[] progress1 = {93, 30, 55};
        int[] progress2 = {95, 90, 99, 99, 80, 99};

        int[] speeds1 = {1, 30, 5};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};


        assertArrayEquals(new int[]{2, 1}, question2.solution(progress1, speeds1));
        assertArrayEquals(new int[]{1, 3, 2}, question2.solution(progress2, speeds2));
    }
}