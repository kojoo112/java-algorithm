package kojoo.java.algorithm.programmers.linear;

public class Question3 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String s : skill_trees) {
            String s2 = s.replaceAll("[^" + skill + "]", "");
            if (skill.startsWith(s2)) {
                answer++;
            }
        }
        return answer;
    }
}
