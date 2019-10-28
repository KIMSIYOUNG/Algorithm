package programmers.level1;

import java.util.Arrays;

class Solution {

    //TODO 97-122 소문자 65-90 대문자.
    //TODO 경우의 수 : 1) 소문자인데 122보다 큰 경우 2) 대문자인데 90보다 큰 경우 3) 나머지 경우
    public static String solution(String s, int n) {
        char[] s_char = s.toCharArray();

        for(int i=0; i<s.length(); i++){
            if(s_char[i]==' ')
                s_char[i]= ' ';
            else{
                if((int)s_char[i]+n>122&&(int)s_char[i]>=97&&(int)s_char[i]<=122)
                    s_char[i] = (char) (s_char[i]+n-26);
                else if((int)s_char[i]>=65&&(int)s_char[i]+n>90&&(int)s_char[i]<=90)
                    s_char[i] = (char)(s_char[i]+n-26);
                else
                    s_char[i] += n;
            }

        }

        String answer ="";
        for(int i=0; i<s_char.length; i++)
            answer +=s_char[i];
        return answer;
    }

    public static void main(String[] args) {
        String ab = Solution.solution("a B z", 4);
        System.out.println(ab);

    }
}