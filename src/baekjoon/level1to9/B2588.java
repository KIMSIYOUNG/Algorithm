package baekjoon.level1to9;

import java.util.Scanner;
import java.util.stream.Stream;

public class B2588 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int first =sc.nextInt();
        int second = sc.nextInt();

        int[] seconde_arr = Stream.of(String.valueOf(second).split("")).mapToInt(Integer::parseInt).toArray();

        int firstMultiply = seconde_arr[2]*first;
        int secondMultiply = seconde_arr[1]*first;
        int thirdMultiply = seconde_arr[0]*first;
        int totalMultiply = first*second;
        System.out.println(firstMultiply);
        System.out.println(secondMultiply);
        System.out.println(thirdMultiply);
        System.out.println(totalMultiply);

    }
}
