package programmers.level2;

class Solution {
    public static int solution(String skill, String[] skill_trees) {
        int answer = skill_trees.length;
        int before = 0;
        int current = 0;

        for (int i = 0; i<skill_trees.length; i++){
            before = skill_trees[i].indexOf(skill.charAt(0));
            for(int k=1; k<skill.length(); k++){
                current = skill_trees[i].indexOf(skill.charAt(k));
                if(before>current&&current!=-1 || before == -1 && current != -1){
                    answer--;
                    break;
                }
                before = current;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int cbd = Solution.solution("CBD", new String[]{"BACDF", "CBADF", "AECB", "BDA"});
        System.out.println(cbd);
    }
}