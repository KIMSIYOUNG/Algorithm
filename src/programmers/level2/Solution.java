package programmers.level2;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] heights) {
        //        6,9,5,7,4;
        //0->0개 1->1개 2->2개 3은 3개 4는 4개
        int[] answer = new int[heights.length];
        for(int i=0; i<heights.length; i++){
            int max = 0;
            for(int k=0; k<i; k++){
                if(heights[k]>heights[i])
                    max = k+1;
            }
            answer[i] = max;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] solution = Solution.solution(new int[]{1, 5, 3, 6, 7, 6 ,5 });
        System.out.println(Arrays.toString(solution));

    }
}