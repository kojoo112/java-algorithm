package kojoo.java.algorithm.programmers.sk;

public class SKTelecom_2 {
    public int[] solution(int[] periods, int[][] payments, int[] estimates) {
        int[] answer = new int[2];
        boolean[] currentVIP = new boolean[periods.length];
        boolean[] expectedVIP = new boolean[periods.length];

        for (int i = 0; i < payments.length; i++) {
            int sum = 0;
            for (int j = 0; j < payments[i].length; j++) {
                sum += payments[i][j];
            }
            currentVIP[i] = isVIP(periods[i], sum);
        }

        for (int i = 0; i < payments.length; i++) {
            int sum = 0;
            for (int j = 1; j < payments[0].length; j++) {
                sum += payments[i][j];
            }

            expectedVIP[i] = isVIP(periods[i] + 1, sum + estimates[i]);
        }

        for (int i = 0; i < currentVIP.length; i++) {
            if (!currentVIP[i] && expectedVIP[i]) {
                answer[0]++;
            } else if (currentVIP[i] && !expectedVIP[i]) {
                answer[1]++;
            }
        }

        return answer;
    }

    private boolean isVIP(int period, int payment) {

        if (period >= 24 && period < 60) {
            return payment >= 900000;
        } else if (period >= 60) {
            return payment >= 600000;
        }

        return false;
    }
}
