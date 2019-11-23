package aboutjava.javautilStudy;

import java.util.*;

/**
 * List Inteface를 구현하고 있는 ArrayList를 통해 사용
 * Linkedlist, Vector 등도 있음. 중복이 허용되며 크기가 제한되어있지 않은 자료구조.
 * Map은 Key Value로 이루어진 자료구조로 Key는 중복이 허용되지 않으나(그래서 Key Set이라고 부름) Value는 중복되어도 상관없다.
 * Map Interface 를 구현한 HashMap을 통해 사용가능하다.
 */
public class ListAndMapTest {
    public static void main(String[] args) {
        //List
        List<String> list = new ArrayList<String>();
        list.add("hello world");
        list.add("hello world");
        System.out.println(list.size()); //중복허용
        list.add("banana");
        list.add("apple");
        Collections.sort(list);
        for(String s : list)
            System.out.println(s);
        //Map
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"kim");
        map.put(2,"yeon");
        System.out.println(map.size());
        for(int i=1; i<map.size()+1; i++)
            System.out.println(map.get(i));
        //맵의 Key값 꺼내기
        Set<Integer> integers = map.keySet();
        Iterator<Integer> iterator = map.keySet().iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
        for(int i : integers)
            System.out.println(i);


    }
}
