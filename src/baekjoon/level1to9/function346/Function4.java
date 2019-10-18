package baekjoon.level1to9.function346;

import java.util.Scanner;

public class Function4 {
    private static int sum =1;

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(Function4.factorial(N));
    }

    private static int factorial(int n) {
        while(n>=1){
            sum *= n;
            n--;
        }
        return sum;
    }
}
