package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BruthForce1 {
    public static void main(String[] args) throws IOException {
        //TODO 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        StringTokenizer s1 = new StringTokenizer(br.readLine());
        for(int i=0; i<arr.length; i++)
            arr[i]= Integer.parseInt(s1.nextToken());
        //TODO 각 배열의 값들을 더하며 비교
        int sum =0;
        int max =0;
        for(int a=0; a<arr.length; a++){
            for(int b=a+1; b<arr.length; b++){
                for(int c=b+1; c<arr.length; c++){
                   sum = arr[a]+arr[b]+arr[c];
                   if(max<sum&&sum<=M)
                       max = sum;
                }
            }
        }
        System.out.println(max);
    }
}
