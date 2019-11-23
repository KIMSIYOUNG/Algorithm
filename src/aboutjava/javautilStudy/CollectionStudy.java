package aboutjava.javautilStudy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class CollectionStudy {

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 0, 9, 6, 5, 4, 3, 2, 5, 6, 7, 9, 65, 4, 4, 2, 2, 2, 1, 4, 5, 6, 8, 9, 0};
        for(int i=0; i<ints.length; i++)
            hashSet.add(ints[i]);
        Object[] a = hashSet.toArray();
        System.out.println(hashSet);
    }
}
