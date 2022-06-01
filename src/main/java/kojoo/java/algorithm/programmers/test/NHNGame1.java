package kojoo.java.algorithm.programmers.test;


public class NHNGame1 {
    public int solution(int[][] cards1, int[][] cards2) {
        int answer = 0;
        int[] temp1;
        int[] temp2;

        temp1 = cards1[0].clone();
        temp2 = cards2[0].clone();

        for (int i = 0; i < cards1[0].length; i++) {
            for (int j = 0; j < cards2[0].length; j++) {
                if (cards1[0][i] == cards2[0][j]) {
                    answer++;
                    break;
                }
            }
            if (answer == 1) {
                break;
            }
        }

        for (int i = 1; i < cards1.length; i++) {

            if (!compareCard(cards1[i], cards2[i])) {
                answer++;
                temp1 = cards1[i].clone();
                temp2 = cards2[i].clone();
                continue;
            }
            if (!compareWithPreviousCard(cards1[i], temp1)) {
                answer++;
                temp1 = cards1[i].clone();
                temp2 = cards2[i].clone();
                continue;
            }
            if (!compareWithPreviousCard(cards2[i], temp2)) {
                answer++;
                temp1 = cards1[i].clone();
                temp2 = cards2[i].clone();
                continue;
            }

            temp1 = cards1[i].clone();
            temp2 = cards2[i].clone();

        }

        return answer;
    }

    private boolean compareCard(int[]card1, int[] card2) {
        for (int i = 0; i < card1.length; i++) {
            for (int j = 0; j < card1.length; j++) {
                if (card1[i] == card2[j]) {
                    return false;
                }

            }
        }
        return true;
    }

    private boolean compareWithPreviousCard(int[] card, int[] temp) {
        int count = 0;

        for (int i = 0; i < card.length; i++) {
            for (int j = 0; j < card.length; j++) {
                if (card[i] == temp[j]) {
                    count++;
                }
                if (count > 1) {
                    return false;
                }

            }

        }
        return true;
    }
}
