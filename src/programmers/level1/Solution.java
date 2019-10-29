package programmers.level1;

import java.util.Arrays;

class Solution{
    public static int[] solution(int money){
        int[] result = new int[9];
        result[0]=money/50000;
        money %= 50000;
        result[1]=money/10000;
        money %= 10000;
        result[2]=money/5000;
        money %= 5000;
        result[3]=money/1000;
        money %= 1000;
        result[4]=money/500;
        money %= 500;
        result[5]=money/100;
        money %= 100;
        result[6]=money/50;
        money %= 50;
        result[7]=money/10;
        money %= 10;
        result[8]=money/1;
        money %= 1;
        return result;
    }

    public static void main(String[] args) {
        int[] solution = Solution.solution(1324);
        System.out.println(Arrays.toString(solution));
    }
}