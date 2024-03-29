package book.basic;

import java.util.Scanner;

public class Array {

    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1]= a[idx2];
        a[idx2] =t;
    }

    static void reverse(int[] a){

        for(int i=0; i<a.length / 2; i++){
            swap(a, i, a.length-i-1 );
        }
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("몇개?");
        int num = sc.nextInt();

        int[] x = new int[num];
        for(int i =0; i<x.length; i++){
            System.out.println("입력해 안에 값들");
            x[i] = sc.nextInt();
        }

        reverse(x);

        System.out.println("재정렬 완료");
        for(int i=0; i<num; i++){
            System.out.println(x[i]);
        }

    }

}
