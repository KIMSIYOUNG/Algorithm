package programmers;

import java.util.*;

class Solution {
        public static int solution(int[] people, int limit) {
            Arrays.sort(people);

            int answer = 0;
            int index = people.length - 1;
            for (int i = 0; i <= index; i++, answer++)
                while (index > i && people[i] + people[index--] > limit)
                    answer++;

            return answer;
        }
        public static void main(String[] args) {
            int solution = solution(new int[]{20,90,80,50,30,40,50}, 100);
            System.out.println(solution);
        }
    }
