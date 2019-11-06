package study;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorAndComparable {
    public static void main(String[] args) {
        String[] str_arr = new String[]{"hello","world","good","morning"};
        List<String> strings = Arrays.asList(str_arr);
        Arrays.sort(str_arr);
        Collections.sort(strings);

        System.out.println(Arrays.toString(str_arr));
        System.out.println(strings.toString());
    }
}
