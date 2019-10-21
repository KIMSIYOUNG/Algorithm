package baekjoon.level1to9.math_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Math2 {
    public static void main(String[] args) throws IOException {
        //TODO 입력을 받고,
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        List<Integer> result = new ArrayList<>();
        //TODO 소수를 찾아 배열에 담는다
        for(int i=M; i<=N; i++){
            if(Math2.checkPrime(i))
                result.add(i);
        }
        if(result.size()==0)
            System.out.println(-1);
        else{
            //TODO 배열을 재정렬하여 최소값과 합계를 리턴한다
            Collections.sort(result);
            int sum =0;
            for(int i=0; i<result.size(); i++)
                sum += result.get(i);
            System.out.println(sum);
            System.out.println(result.get(0));
        }
    }
    //TODO 소수인지를 체크하는 메소드
    private static boolean checkPrime(int i) {
        int count =0;
        for(int k=1; k<=i; k++){
            if(i%k==0)
                count++;
        }
        return count==2?true:false;
    }
}
