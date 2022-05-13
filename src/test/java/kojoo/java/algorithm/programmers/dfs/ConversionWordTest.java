package kojoo.java.algorithm.programmers.dfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConversionWordTest {

    @Test
    void solution() {
        ConversionWord conversionWord = new ConversionWord();

        String begin = "hit";
        String target = "cog";
        String[] words1 = {"hot", "dot", "dog", "lot", "log", "cog"};
        String[] words2 = {"hot", "dot", "dog", "lot", "log"};

//        assertEquals(4, conversionWord.solution(begin, target, words1));
        assertEquals(0, conversionWord.solution(begin, target, words2));
    }
}