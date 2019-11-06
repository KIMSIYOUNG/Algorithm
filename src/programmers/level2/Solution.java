package programmers.level2;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public static int solution(int []A, int []B) {
        int answer = 0;
        Integer[] arr = new Integer[B.length];
        for(int i=0; i<arr.length; i++)
            arr[i] = B[i];
        Arrays.sort(A);
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0; i<A.length; i++){
            answer += A[i] * arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,4,2},new int[]{5,4,4}));
        System.out.println(solution(new int[]{1,2,},new int[]{3,4}));
    }
}