package baekjoon.level1to9.function346;

import java.util.Scanner;

public class Function3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        //TODO 입력값의 범위에 따른 다른 처리
        if(N<100){
            count = N;
        }else{
            for(int i=100; i<=N; i++)
                count += Function3.checkHanNumber(i);
            count += 99;
        }
        System.out.println(count);

    }
    //TODO 한수인지 검사하는 메소드
    private static int checkHanNumber(int n) {
        int first = n%100%10; //마지막 자리 수
        int second = n/10%10; //두번째 자리 수
        int third = n/100; //첫번째 자리수
        return (second*2==first+third)?1:0;
    }

}