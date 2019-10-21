package baekjoon.level1to9.math_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int check = 0;
        //TODO 소수인지 확인
        for(int i=M; i<=N; i++){
            if(i==1) check =1;
            int sqrt = (int)Math.sqrt(i)+1;
            for(int k=2; k<sqrt; k++){
                if(i%k==0){
                    check=1;
                    break;
                }
            }
            if(check==0)
                System.out.println(i);
            check =0;
        }

    }

}
