package programmers.level1;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static String solution(String s) {
        //TODO 1) 띄어쓰기 단위로 쪼개서 배열에 담는다.
        String[] s1 = s.trim().split(" ");
        //TODO 2) 배열 인덱스 하나씩 Char 의 형태로 쪼개 대소문자를 구분한다.
        List<Character> arr = new ArrayList<>();
        for(int i=0; i<s1.length; i++){
            for(int j=0; j<s1[i].length(); j++){
                if ((j % 2 == 0)) {
                    arr.add(Character.toUpperCase(s1[i].charAt(j)));
                } else {
                    arr.add(Character.toLowerCase(s1[i].charAt(j)));
                }
            }
            arr.add(' ');
        }
        String answer = "";
        for(int i =0; i<arr.size()-1; i++){
            answer += arr.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        String example = "he llo  world  i m siyoung";
        System.out.println(Solution.solution(example));
    }
}