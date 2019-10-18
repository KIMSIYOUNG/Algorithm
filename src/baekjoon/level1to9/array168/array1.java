package baekjoon.level1to9.array168;

import java.util.Arrays;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TN= sc.nextInt();
        //TODO 입력 값과 일치하는 배열 생성
        int[] arr = new int[TN];
        //TODO 배열에 값을 담고,
        for(int i=0; i<arr.length; i++)
            arr[i] = sc.nextInt();
        //TODO sort한 다음 꺼낸다.
        Arrays.sort(arr);
        System.out.print(arr[0]+" "+arr[arr.length-1]);

    }
}
