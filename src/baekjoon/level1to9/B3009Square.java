package baekjoon.level1to9;

import java.util.Scanner;

public class B3009Square {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String[] first_arr = first.split(" ");
        String second = sc.nextLine();
        String[] second_arr = second.split(" ");
        String third = sc.nextLine();
        String[] third_arr = third.split(" ");

        String result ="";

        if((!first_arr[0].equals(second_arr[0]) && !first_arr[0].equals(third_arr[0])))
            result += first_arr[0];
        else if(first_arr[0].equals(second_arr[0]))
            result += third_arr[0];
        else if(first_arr[0].equals(third_arr[0]))
            result += second_arr[0];


        if(!first_arr[1].equals(second_arr[1]) && !first_arr[1].equals(third_arr[1]))
            result += " "+first_arr[1];
        else if(first_arr[1].equals(second_arr[1]))
            result += " "+third_arr[1];
        else if(first_arr[1].equals(third_arr[1]))
            result += " "+second_arr[1];

        System.out.println(result);


    }

}
