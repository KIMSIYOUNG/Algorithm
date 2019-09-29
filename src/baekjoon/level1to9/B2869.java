package baekjoon.level1to9;

import java.util.Scanner;

public class B2869 {

    static int a,b,v;

    public static void main(String[] args) {

        long begin = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt(); //올라가는 높이
        b = sc.nextInt(); //떨어지는 높이
        v = sc.nextInt(); //총 높이

        int day = 0;
        int h = 0;

        while(true){
            day++;
            h += a;
            if(h>=v) break;
            h -= b;
        }
        System.out.println(day);

        System.out.println(System.currentTimeMillis()-begin);
    }

}
