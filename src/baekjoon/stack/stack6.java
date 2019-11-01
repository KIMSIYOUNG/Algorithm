package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class stack6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[test];
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] result = new int[test];
        for(int i=0; i<arr.length; i++){
            for(int k=i+1; k<arr.length; k++){
                if(arr[i]<arr[k]){
                    result[i] = arr[k];
                    break;
                }
            }
            if(result[i]==0)
                result[i]= -1;
        }
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }

    }
}
