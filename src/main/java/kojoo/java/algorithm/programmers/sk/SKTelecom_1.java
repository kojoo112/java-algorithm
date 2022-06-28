package kojoo.java.algorithm.programmers.sk;

public class SKTelecom_1 {
    public int[] solution(int[] p) {
        int[] count = new int[p.length];
        int currentNum = 0;

        int index = 0;

        for (int i = 0; i < p.length; i++) {
            int min = p[i];
            for (int j = i + 1; j < p.length; j++) {
                currentNum = p[j];
                if (min > currentNum) {
                    min = currentNum;
                    index = j;
                }
            }
            if (p[i] != min) {
                int temp = p[i];
                p[i] = min;
                p[index] = temp;
                count[i]++;
                count[index]++;
            }
        }


        return count;
    }
}
