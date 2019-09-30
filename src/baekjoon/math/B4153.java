package baekjoon.math;

import java.io.IOException;
import java.util.Scanner;

public class B4153 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while(true){
            String input = sc.nextLine();
            String[] input_str_arr = input.split(" ");
            int max = Integer.parseInt(input_str_arr[0]);
            int sum = 0;
            int count =0;

            for(int i=0; i<input_str_arr.length; i++){
                if(input_str_arr[i].equals("0"))
                    count++;
            }
            if(count==3)
                break;


            for(int i=0; i<input_str_arr.length; i++){
                if(Integer.parseInt(input_str_arr[i])>max)
                    max = Integer.parseInt(input_str_arr[i]);
            }
            for(int i=0; i<input_str_arr.length; i++){
                if(Integer.parseInt(input_str_arr[i])<max){
                    sum += (int) Math.pow(Integer.parseInt(input_str_arr[i]),2);
                }
            }
            if(sum==Math.pow(max,2))
                System.out.println("right");
            else
                System.out.println("wrong");

        }

    }
}
