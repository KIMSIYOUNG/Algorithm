package baekjoon.level1to9.array168;

import java.util.Arrays;
import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TN = sc.nextInt();

        for(int i=0; i<TN; i++){
            int N = sc.nextInt();
            int sum = 0;
            int count = 0;
            int[] arr = new int[N];
            //TODO 입력값을 받아 배열에 담는다.
            for(int j=0; j<N; j++){
                arr[j]=sc.nextInt();
            }
            //TODO 평균을 구한다.
            for (int value : arr) {
                sum += value;
            }
            int avg = sum/arr.length;
            //TODO 평균이 넘는 학생의 수를 구한다.
            for (int value : arr) {
                if (value > avg)
                    count++;
            }
            double answer = (double)count/arr.length * 100;
            System.out.printf("%.3f",answer);
            System.out.print("%\n");
        }
    }
}
