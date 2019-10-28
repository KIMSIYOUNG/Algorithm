package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution {

    public static int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();

        list.add(arr[0]);
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]!=arr[i+1])
                list.add(arr[i+1]);
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++)
            answer[i]=list.get(i);
        return answer;
    }

    public static void main(String[] args) {
        int[] solution = Solution.solution(new int[]{1, 1, 3, 3, 0, 1, 1});
        System.out.println(Arrays.toString(solution));
    }
}