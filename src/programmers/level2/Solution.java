package programmers.level2;

import java.util.Arrays;

class Solution {
    public static String solution(String s) {
        int max = 0; int min = 0; String answer = "";
        String[] s1 = s.split(" ");
        int[] ints = new int[s1.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(s1[i]);
        }
        Arrays.sort(ints);
        max = ints[0];
        min = ints[ints.length-1];
        answer = String.valueOf(max)+" "+String.valueOf(min);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("1 2 3 4"));
        System.out.println(solution("-1 -2 -3 -4"));
        System.out.println(solution("-1 -1"));
    }
}