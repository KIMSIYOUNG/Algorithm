package baekjoon.arrangement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Arrange11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] x = new int[T];
        int[] y = new int[T];
        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i]= Integer.parseInt(st.nextToken());
            y[i]= Integer.parseInt(st.nextToken());
        }
        Arrays.sort(y);
        Arrays.sort(x);
        for(int i=0; i<T; i++){
            System.out.println(x[i]+" "+y[i]);
        }

    }
}
