package programmers.level1;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int input = 127;
        System.out.println(Solution.solution(input));
    }
    //TODO 1번 방법 : 형변환 이후 다시 형변환
    public static int solution(Integer n) {
        String s = n.toString();
        String[] split = s.split("");
        int answer = 0;

        for(int i=0; i<split.length; i++) {
            answer += Integer.parseInt(split[i]);
        }
        return answer;
        //TODO 2번 방법
//        while(true){
//            answer+=n%10;
//            if(n<10)
//                break;
//            n+=n/10;
//
//        }
    }
}