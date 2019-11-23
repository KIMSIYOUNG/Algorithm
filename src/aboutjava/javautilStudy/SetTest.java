package aboutjava.javautilStudy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set은 Collection을 상속하고 있는 자료구조로 중복이 허용되지 않는다는 특징을 갖는다.
 * Set의 값을 확인하고 싶을때는 Iterator & For-each를 활용하여 사용가능하다.
 * (단순히 조회만을 원한다면 System.out.prinln(set)을 통해서도 배열의 형태로 확인 가능하다.
 */
public class SetTest {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        boolean flag = set.add("hello");
        boolean flag2 = set.add("world");
        boolean flag3 = set.add("hello");

        System.out.println(set.size());
        Iterator<String> iterator = set.iterator();
        //출력
        System.out.println(set);
        while(iterator.hasNext())
            System.out.println(iterator.next());
        for(String s : set)
            System.out.println(s);
    }
}
