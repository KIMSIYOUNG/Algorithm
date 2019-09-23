package baekjoon;

//시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
//2 초	128 MB	33600	15533	12902	48.840%
//문제
//주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
//
//입력
//첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
//
//출력
//주어진 수들 중 소수의 개수를 출력한다.

import java.io.StringReader;
import java.util.Scanner;

public class B1978 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int TestCase = sc.nextInt();
        int cnt =0;

        for(int i =0; i<TestCase; i++){
            int count = 0;
            int number = sc.nextInt();
            for(int j=1; j<=number; j++){
                if(number % j == 0)
                    count++;
            }
            if(count==2){
                cnt++;
            }
        }
        System.out.println(cnt);


    }
}
