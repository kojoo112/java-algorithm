package kojoo.java.algorithm.programmers.test;

import java.util.Stack;

class Money {
    int id;
    int gold;

    public Money(int id, int gold) {
        this.id = id;
        this.gold = gold;
    }
}

public class NHNGame2 {
    public int[] solution(int[] balance, int[][] transaction, int[] abnormal) {
        int[] answer = {};

            Stack<Money> stack = new Stack<>();
        for (int i = 0; i < balance.length; i++) {
            stack.push(new Money(i, balance[i]));
        }
        System.out.println(stack);



        return answer;
    }
}
