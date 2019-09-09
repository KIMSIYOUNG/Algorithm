package codeUp;

import java.util.Scanner;

public class codeUp1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String input_str = String.valueOf(input);
        int input_str_length = input_str.length();

        for(int i =0; i<input_str_length; i++){
            System.out.println("["+input_str+"]");
        }
    }
}
