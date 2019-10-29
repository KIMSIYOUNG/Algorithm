package programmers.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0;
        int i = 0;
        Queue<Integer> q = new LinkedList<Integer>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int[] car_d = new int[truck_weights.length];

        while(true) {
            answer++;
            //while문이므로 i를 직접 설정해서 새로운 트럭이 다리를 지나가면 증가시켜준다.
            if(i<truck_weights.length && sum + truck_weights[i] <= weight) {
                q.add(truck_weights[i]);
                sum += truck_weights[i];
                i++;
            }
            // -1은 다리를 이미 건넜다는 표시이다.
            for(int j=0; j<i; j++) {
                if(car_d[j] != -1) {
                    car_d[j]++;
                }
            }
            //시간이 길이와 같으면 나오면서 전체 무게를 빼주고 시간 배열을 -1로 바꿔준다.
            for(int j=0; j<i; j++) {
                if(car_d[j] == bridge_length) {
                    int complete = q.poll();
                    arr.add(complete);
                    sum -= complete;
                    car_d[j] = -1;
                }
            }
            //마지막에는 시간 추가가 안되므로 나오면서 answer++을 해준다.
            if(arr.size() == truck_weights.length) {
                answer++;
                break;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        int solution = Solution.solution(2, 10, new int[]{7, 4, 5, 6});
        System.out.println(solution);
    }
}