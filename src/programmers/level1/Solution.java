package programmers.level1;

import java.util.*;

public class Solution {
    public static int[] solution(int[] arr, int divisor) {
        return Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,5,5,5};
        System.out.println(Arrays.toString(Solution.solution(arr, 5)));
    }
}