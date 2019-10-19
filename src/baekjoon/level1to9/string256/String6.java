package baekjoon.level1to9.string256;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().trim();
        if(input.length()==0)
            System.out.println(0);
        else{
            String[] input_arr = input.split(" ");
            System.out.println(input_arr.length);
        }


    }
}
