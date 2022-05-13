package kojoo.java.algorithm.programmers.test;

public class Question_1 {

    public int solution(int[][] atmos) {
        int answer = 0;
        int mask = 0;

        for(int i=0; i < atmos.length; i++){
            int fd = atmos[i][0];
            int ufd = atmos[i][1];
            // fd : 81 이상, ufd : 36 이상 => 착용 => 둘 다 나쁨 당일 버림
            if(fd >= 151 && ufd >= 76){
                mask = 0;
                answer++;
            } else if (fd >= 81) {
                mask++;
            } else if (ufd >= 36) {
                mask++;
            } else {
                if(mask != 0){
                    mask++;
                }
            }
            if(mask == 3 || (mask != 0 && i== atmos.length-1)){
                mask = 0;
                answer++;
            }
        }
        return answer;
    }
}