package baekjoon.level1to9;

import java.util.ArrayList;
import java.util.Scanner;

public class B2581Decimal {

    public static void main(String[] args) {

        ArrayList arr = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int sum_of_arr =0;

        for(int i=M; i<=N; i++){
            int count = 0;
            for(int j=1; j<=i; j++){
                //소수가 아닐 때
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                arr.add(i);
            }
        }

        if(arr.size()<=0)
            System.out.println(-1);
        else{
            for(int i=0; i<arr.size(); i++){
                sum_of_arr += Integer.parseInt(String.valueOf(arr.get(i)));
            }
            System.out.println(sum_of_arr);
            System.out.println(arr.get(0));
        }
    }
}
