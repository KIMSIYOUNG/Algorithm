package book.search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchApi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("요소의 개수 : ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("오름차순으로 입력 해 주세요.");
        System.out.println("arr[0] : ");
        arr[0] = sc.nextInt();

        for(int i=1; i<num; i++){
            do{
                System.out.println("arr["+i+"] : ");
                arr[i] = sc.nextInt();
            }while (arr[i]<arr[i-1]);
        }

        System.out.println("검색하고자 하는 값?");
        int key = sc.nextInt();
        int index = Arrays.binarySearch(arr, key);
        if(index<0) {
            System.out.println("그 값의 요소가 없습니다.");
            System.out.println(index);
        }
        else
            System.out.println("그 값은, arr["+index+"]에 있습니다");
    }
}
