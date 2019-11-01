package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Stack2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int test = Integer.parseInt(br.readLine());
        for (int i = 0; i < test; i++) {
            int input = Integer.parseInt(br.readLine());
            if ((input == 0) && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(input);
            }
        }
        int sum = 0;
        for(int i=0; i<stack.size(); i++)
            sum += stack.get(i);
        System.out.println(sum);

    }
}
