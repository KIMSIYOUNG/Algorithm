package programmers.level1;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        //TODO Array에서 commands를 참고해 값을 나눈다
        for(int i=0; i<commands.length; i++){
            int[] result = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(result);
            answer[i]=result[commands[i][2]-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[] solution = Solution.solution(array, commands);
        System.out.println(Arrays.toString(solution));
    }

}