package baekjoon.level1to9.math_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int check = 0;
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n==0)
                break;
            //TODO 연산을 줄이기 위해서
            int N = n+1;
            int N2 = 2*n;
            for(int i=N; i<=N2; i++){
                int sqrt = (int)Math.sqrt(i)+1;
                for(int k =2; k<sqrt; k++)
                    if(i%k==0){
                        check =1;
                        break;
                    }
                if(check==0)
                    count++;
                check =0;
            }
            System.out.println(count);
            count =0;
        }
    }
}
