package programmers.level2;

class Solution {
    public static String solution(String s) {
        String answer = "";
        String[] split = s.toLowerCase().split("");
        boolean flag = true;
        for(String ss : split){
            answer += flag?ss.toUpperCase():ss;
            flag = ss.equals(" ")?true:false;
        }
        return answer;
    }
//97 122 65 90      65 90 97 122
    public static void main(String[] args) {
        String for_the_last_week = solution("3people unFollowed me");
        System.out.println(for_the_last_week);
    }
}