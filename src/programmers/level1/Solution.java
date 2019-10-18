package programmers.level1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> test = new ArrayList<>();
        if(arr.length==1)
            return new int[]{-1};
        //TODO 선언한 리스트에 담기(기능 이용하려고)
        for(int i=0; i<arr.length; i++)
            test.add(arr[i]);
        //TODO 최소값 구하고 리스트에서 제거
        Integer min = Collections.min(test);
        test.remove(min);
        //TODO 다시 인트형 배열에 담아서 리턴
        int answer[] = new int[test.size()];
        for(int i=0; i<test.size(); i++)
            answer[i] = test.get(i);

        return answer;
    }
}