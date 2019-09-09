package codeUp;

import java.util.Scanner;

public class codeUp1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String a1 = a.split(":")[0];
        String a2 = a.split(":")[1];
        String a3 = a.split(":")[2];
        if(a2.equals("00")){
            System.out.println("0");
        }else{
            System.out.println(a2);
        }


    }

}
