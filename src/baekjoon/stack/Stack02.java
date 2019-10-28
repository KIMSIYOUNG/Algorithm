package baekjoon.stack;

import java.util.*;

public class Stack02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0; i<testcase; i++){
            int number = sc.nextInt();
            if(number!=0)
                stack.push(number);
            else if(number==0&&!stack.isEmpty())
                stack.pop();
        }
        int sum = 0;
        for(int i=0; i<stack.size(); i++)
            sum += stack.get(i);

        System.out.println(sum);
    }

}
