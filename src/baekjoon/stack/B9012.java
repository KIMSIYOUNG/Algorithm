package baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

public class B9012 {

    public static void main(String[] args) {
        String[] str_arr = new String[100];
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for(int i=0; i<testCase; i++){
            int count =0;
            boolean vps;
            String input = sc.next();
            for(int j = 0; j<input.length(); j++){
                str_arr[j]=String.valueOf(input.charAt(j));
                if(count<0){
                    vps = false;
                    break;
                }
                if(str_arr[j].equals("("))
                    count++;
                else
                    count--;
            }
            if(count==0)
                vps=true;
            else
                vps=false;
            System.out.println(vps?"YES":"NO");
        }



    }
}
