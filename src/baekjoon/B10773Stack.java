package baekjoon;

import book.IntStack;

import java.util.Scanner;
import java.util.Stack;

public class B10773Stack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        int sum_of_stack =0;

        int testcase = sc.nextInt();
        for(int i=0; i<testcase; i++){
            int input =sc.nextInt();
            if(input!=0)
                stack.push(input);
            else if(input==0&&!stack.isEmpty())
                stack.pop();
        }

        while(!stack.isEmpty()){
            sum_of_stack += stack.pop();
        }

        System.out.println(sum_of_stack);


    }

}
