package programmers.level1;

import java.util.*;

class Solution {
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings);

        Map<Integer,Character> map = new HashMap<>();
        for(int i=0; i<strings.length; i++){
            map.put(i,strings[i].charAt(n));
        }
        Iterator<Integer> it = sortByValue(map).iterator();

        String[] answer = new String[strings.length];
        for(int i=0; it.hasNext(); i++){
            answer[i]=strings[it.next()];
        }
        return answer;
    }

    private static List<Integer> sortByValue(Map<Integer, Character> map) {
        List<Integer> list = new ArrayList<Integer>();
        list.addAll(map.keySet());
        Collections.sort(list, new Comparator<Object>(){
            public int compare(Object o1, Object o2){
                Object v1  = map.get(o1);
                Object v2 = map.get(o2);
                return ((Comparable<Object>)v1).compareTo(v2);
            }
        });
        return list;
    }

    public static void main(String[] args) {
        String[] solution = Solution.solution(new String[]{"sun", "bed", "car"}, 1);
        System.out.println(Arrays.toString(solution));
    }
}