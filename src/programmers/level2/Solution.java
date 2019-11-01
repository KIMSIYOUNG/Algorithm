package programmers.level2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public static int solution(int[] priorities, int location) {
        int answer = 1;

        PriorityQueue priority = new PriorityQueue<>(Collections.reverseOrder());

        for (int task : priorities) {
            priority.add(task);
        }
        //{2,5,4,1,3};

        while (!priority.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == (int) priority.peek()) {
                    if (i == location) {
                        return answer;
                    }
                    priority.poll();
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int solution = Solution.solution(new int[]{2, 1, 3, 2, 3, 4}, 4);
        System.out.println(solution);
    }
}