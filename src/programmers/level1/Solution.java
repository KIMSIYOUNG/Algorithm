package programmers.level1;


import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(12379)));
    }
    public static int[] solution(long n) {
        String input = String.valueOf(n);
        String[] split = input.split("");

        int[] answer = new int[split.length];
        for(int i=0; i<split.length; i++){
            answer[i]= Integer.parseInt(split[split.length-i-1]);
        }
        return answer;
    }
}