package programmers.level2;

import java.util.Arrays;

class Solution {
    public static int solution(int n) {
        int answer = 0;
        String[] s = Integer.toBinaryString(n).split("");
        int s_count = 0;
        for(int i =0; i<s.length; i++)
            if(s[i].equals("1"))
                s_count++;
        for(int i=n+1; i<=1000000; i++){
            String[] split = Integer.toBinaryString(i).split("");
            int count =0;
            for(int k=0; k<split.length; k++)
                if(split[k].equals("1"))
                    count++;
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