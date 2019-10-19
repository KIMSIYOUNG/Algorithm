package baekjoon.level1to9.string256;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;
        //TODO 값을 입력받고 쪼개서
        String input = sc.next();
        String[] split = input.split("");
        //TODO 값을 변환해 더한 값을 리턴한다.
        for(int i=0; i<split.length; i++){
           result += Integer.parseInt(split[i]);
        }
        System.out.println(result);
    }
}
