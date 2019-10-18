package baekjoon.level1to9.while123;

import java.util.Scanner;

public class while3 {
    private static int count =0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        //TODO 계속해서 변경되는 값을 원래의 값과 비교하기 위해 result 라는 input값을 복사한 변수생성
        int result = input;

        while(true){
            result = (result%10) *10 + (result/10 + result%10)%10;
            count++;
            if(result==input)
                break;
        }
        System.out.println(count);

    }
}
