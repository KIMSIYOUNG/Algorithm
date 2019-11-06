package programmers.level2;

import java.util.Arrays;

class Solution {
    public static int solution(int n) {
        int answer = 0;
        int s_count = Integer.bitCount(n);

        for(int i=n+1; i<=1000000; i++){
            int count =Integer.bitCount(i);
            if(s_count==count){
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(15));
    }
}