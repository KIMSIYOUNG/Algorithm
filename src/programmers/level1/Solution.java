package programmers.level1;

import java.util.*;

public class Solution {
    public static int[] solution(int[] arr, int divisor) {
        //TODO 리스트에 값을 담고
        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0)
                answer.add(arr[i]);
        }
        //TODO 배열에 다시 담음
        int[] result = new int[answer.size()];
        for(int i=0; i<result.length; i++){
            result[i]=answer.get(i);
        }
        //TODO 출력
        if(result.length==0){
            result = new int[1];
            result[0]=-1;
            return result;
        }
        else{
            Arrays.sort(result);
            return result;
        }
    }
}