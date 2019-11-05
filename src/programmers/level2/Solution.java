package programmers.level2;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public static String solution(int[] numbers) {
        /** 1)선언부  **/
        String answer = "";
        String[] str = new String[numbers.length];
        for(int i=0; i<numbers.length; i++)
            str[i]=String.valueOf(numbers[i]);
        /** 2)정렬 **/
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        if(str[0].startsWith("0"))
            answer += 0;
        else{
            for(int i=0; i<str.length; i++)
                answer += str[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        String solution = solution(new int[]{3,30,34,5,9});
        System.out.println(solution);
    }
}