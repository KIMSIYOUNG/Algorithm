package baekjoon.math;

import java.util.Scanner;

public class B9020 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=0;
        int a=0,b=0;
        int n = 0;

        int z=input.nextInt();
        for(int j=0;j<z;j++)
        {
            n=input.nextInt();
            for(a=n/2,b=n/2;;a++,b--)
            {
                n=a+b;
                if(check(a)&&check(b))
                {
                    System.out.println(b+" "+a);
                    break;
                }
            }
        }
    }
    public static boolean check(int n) {

        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
