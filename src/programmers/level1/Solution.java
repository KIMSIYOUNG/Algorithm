package programmers.level1;

class Solution {
    public static String solution(String s) {

        String answer = "";
        if(s.length()%2!=0){
            answer = String.valueOf(s.charAt(s.length()/2));
        }else{
            answer =String.valueOf(s.charAt(s.length()/2-1))
                    +String.valueOf((s.charAt(s.length()/2)));
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Solution.solution("qwera"));
    }
}