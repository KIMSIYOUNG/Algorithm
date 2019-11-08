package programmers.level2;

import java.util.Arrays;

class Solution {
    public static int solution(int[] arr) {
        Arrays.sort(arr);
        int answer = arr[0];
        int small = 0;
        int big = 0;
        for(int i=1; i<arr.length; i++){
            small = Math.min(answer,arr[i]);
            big = Math.max(answer,arr[i]);

            answer = small * big / gcd(small,big);
        }
        return answer;
    }

    private static int gcd(int small, int big) {
        int answer = 0;
        for(int i=1; i<=small; i++){
            if(small%i==0 &&big%i==0)
                answer = i;
        }
        return answer;
    }

    public static void main(String[] args) {
        int solution = solution(new int[]{5,10,15});
        System.out.println(solution);
    }


}