package programmers.level1;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();

        //TODO 행과 열에 맞게 직사각형 출력
        for(int i=0; i<height; i++){
            for(int k=0; k<width; k++)
                System.out.print("*");
            System.out.println("");
        }
    }
}
