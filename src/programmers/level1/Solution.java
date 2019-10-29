package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(Arrays.toString(solution(N, stages)));

    }

    public static int[] solution(int N, int[] stages) {

        //stage별 사용자 수를 담는 HashMap 생성(key:stage, value:사용자 수)
        Map<Integer, Integer> frequency = new HashMap<>();
        //stage별 실패율을 담는 HashMap 생성(key:stage, value:실패율)
        Map<Integer, Double> failureRate = new HashMap<>();


        //stage별 사용자 수를 HashMap에 데이터를 추가
        for(int stage : stages) {
            //stage가 key로 존재하면 value값에 1을 더하고, key가 존재하지 않으면 1을 넣음
            int count = frequency.containsKey(stage) ? frequency.get(stage) + 1 : 1;
            frequency.put(stage, count);
        }

        //stages배열의 길이로 사용자 수를 구함.
        int numberOfUsers = stages.length;

        //stage별 사용자 수를 이용해 각 stage별 실패율을 구함
        //stage는 1부터, N까지
        for(int i = 1; i <= N; i++) {
            //stage번호 i가 키 값으로 존재하면
            //실패율을 담는 HashMap에 key로 스테이지 값 i와
            //value로 stage에 남아 있는 사람과 통과한 사람을 나누어 저장 후
            //해당 스테이지를 통과하지 못한(남아있는 사람 수)를 전체사용자 수에서 뺌(다음 스테이지 실패율을 위해)
            if(frequency.containsKey(i)) {
                failureRate.put(i, (double)(frequency.get(i))/numberOfUsers);
                numberOfUsers -= frequency.get(i);
            }
            else {
                //stage번호 i가 key값으로 있지 않으면,
                //전부 해당 stage를 통과했으므로 실패율은 '0'
                failureRate.put(i, 0.0);
            }
        }


        //ArrayList에 failureRate의 keySet()을 받아옴
        List<Integer> list = new ArrayList();
        list.addAll(failureRate.keySet());

        //list를 Collections.sort의 파라미터로 Comparator를 이용해 임의로
        //failureRate의 value 값을 기준으로 정렬시킴
        Collections.sort(list, (Comparator)(o1,o2)->{
//            System.out.println(list);
            Object v1 = failureRate.get(o1);
            Object v2 = failureRate.get(o2);
            return ((Comparable) v2).compareTo( v1);
        });

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
