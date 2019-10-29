package programmers.level2;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

class Solution {
    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new ConcurrentLinkedQueue<Integer>();

        //TODO 걸리는 시간을 큐에 담는다.
        for (int i = 0; i < progresses.length; i++) {
            q.add((100 - progresses[i]) % speeds[i] == 0 ? (100 - progresses[i]) / speeds[i]
                    : (100 - progresses[i]) / speeds[i] + 1);
        }
        System.out.println(q.toString());
        //TODO 시간을 비교해 리스트에 담는다.
        List<Integer> result = new ArrayList<Integer>();
        int standard = q.poll();
        int cnt = 1;
        while (!q.isEmpty()) {
            int num = q.poll();
            if (standard >= num) {
                cnt++;
            } else {
                result.add(cnt);
                cnt = 1;
                standard = num;
            }
        }
        result.add(cnt);
        //TODO 리스트를 다시, 배열에 담아 리턴한다
        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] solution = Solution.solution(new int[]{93, 20, 45, 70}, new int[]{1, 30, 5, 3});
        System.out.println(Arrays.toString(solution));
    }

}