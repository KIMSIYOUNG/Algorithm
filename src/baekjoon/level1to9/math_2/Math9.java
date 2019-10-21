package baekjoon.level1to9.math_2;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Math9 {
    public static void main(String[] args) throws IOException {
        DecimalFormat decimalFormat = new DecimalFormat("0.000000");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(decimalFormat.format(input*input*Math.PI));
        System.out.println(decimalFormat.format(input*input*2));
    }
}
