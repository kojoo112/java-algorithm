package kojoo.java.algorithm.programmers.linear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1Test {

    @Test
    void solution() {
        //phone_book	return
        //["119", "97674223", "1195524421"]	false
        //["123","456","789"]	true
        //["12","123","1235","567","88"]	false

        String[] phone_book1 = {"119", "97674223", "1195524421"};
        String[] phone_book2 = {"123", "456", "789"};
        String[] phone_book3 = {"12", "123", "1235", "567", "88"};

        Question1 question1 = new Question1();

        assertFalse(question1.solution(phone_book1));
        assertTrue(question1.solution(phone_book2));
        assertFalse(question1.solution(phone_book3));

    }
}