package baekjoon.level1to9.array168;

import java.util.Arrays;
import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TN = sc.nextInt();
        double[] arr = new double[TN];
        //TODO 입력값을 배열에 담고,
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //TODO 최대값을 찾은 후 연산을 수행한다.
        Arrays.sort(arr);
        double max = arr[arr.length-1];
        for(int i=0; i<arr.length; i++){
            arr[i] = (double)(arr[i]/max)*100;
        }
        //TODO 다시 평균을 구한다.
        double sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum/arr.length);

    }
}
