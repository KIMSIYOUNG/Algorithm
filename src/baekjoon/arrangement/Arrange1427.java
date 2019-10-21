package baekjoon.arrangement;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Arrange1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer input = sc.nextInt();
        String[] split = input.toString().split("");
        Arrays.sort(split, Comparator.reverseOrder());
        String result = "";
        for(String a:split)
            result += a;
        System.out.println(result);
    }
}
