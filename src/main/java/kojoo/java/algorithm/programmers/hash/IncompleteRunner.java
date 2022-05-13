package kojoo.java.algorithm.programmers.hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IncompleteRunner {

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Set<String> completionSet = new HashSet<>(Arrays.asList(completion));

        for (int i = 0; i < completionSet.size(); i++) {
            if (!completionSet.contains(participant[i])) {
                return participant[i];
            }
        }

        return answer;
    }
//    public String solution(String[] participant, String[] completion) {
//        String answer = "";
//
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//
//        for (int i = 0; i < completion.length; i++) {
//            if (!(participant[i].equals(completion[i]))) {
//                return participant[i];
//            }
//        }
//
//        return participant[participant.length - 1];
//    }
}
