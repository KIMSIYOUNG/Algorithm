package programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public static void main(String[] args) {
        System.out.println(Solution.solution(4953123123450123l));
    }
    public static long solution(long n) {
        //TODO 입력값을 스트링으로 변환하여 배열을 만든다.
        String input = String.valueOf(n);
        String[] split = input.split("");
        //TODO 배열을 내림차순으로 정렬한 후
        Arrays.sort(split, Comparator.reverseOrder());
        //TODO 각 값을 더해 인트로 변환한다.
        String result ="";
        for(String a:split)
           result += a;

        return Long.parseLong(result);
    }
}