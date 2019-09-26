package book;

import java.util.Arrays;
import java.util.Scanner;

public class Search {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("요소의 개수는?");
        int num = sc.nextInt();
        int[] arr = new int[num+1];

        for(int i =0; i<num; i++){
            System.out.println("x["+i+"]: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("검색하고자 하는 값은?");
        int key = sc.nextInt();
        int index = search(arr,num,key);
        System.out.println(Arrays.toString(arr));

        if(index==-1)
            System.out.println("그런 요소가 없습니다.");
        else
            System.out.println(key+"는 x["+index+"] 에 있습니다.");
    }

    static int search(int[] arr, int num, int key) {
        int i =0;

        arr[num] = key;

        while (arr[i] != key) {
            i++;
        }
        return i==num?-1:i;

    }

}
