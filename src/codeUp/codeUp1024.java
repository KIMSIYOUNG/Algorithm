package codeUp;

import java.util.Scanner;

public class codeUp1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] input_arr = input.split("");
        for(int i = 0; i<input_arr.length; i++){
            System.out.println("'"+input_arr[i]+"'");
        }

    }
}
