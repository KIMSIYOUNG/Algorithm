package baekjoon.level1to9.Math278;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        while(T>0){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            Integer H = Integer.parseInt(st2.nextToken());
            Integer W = Integer.parseInt(st2.nextToken());
            Integer N = Integer.parseInt(st2.nextToken());

            Integer floor = N % H;
            Integer hoNumber = (N / H) +1;
            Integer hoNumber2 = N/H;
            if(floor==0&&hoNumber2<10){
                System.out.println(H.toString()+"0"+hoNumber2.toString());
            }else if(floor==0&&hoNumber2>=10)
                System.out.println(H.toString()+hoNumber2.toString());
            else{
                if(hoNumber<10)
                    System.out.println(floor.toString()+"0"+hoNumber.toString());
                else if(hoNumber>=10)
                    System.out.println(floor.toString()+hoNumber.toString());
            }

            T--;
        }
    }
}
