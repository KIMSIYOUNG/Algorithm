package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack5 {
    private static int N;
    private static int num = 1;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        Stack<Integer> stack = new Stack<Integer>();
        //TODO 배열에 담아주고,
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        //TODO 각 항목별로 비교
        boolean tf = true;
        for (int i = 0; i < arr.length; i++) {
            if (tf) {
                if (arr[i] >= num) {
                    while(num<=arr[i]){
                        stack.push(num++);
                        sb.append("+ \n");
                    }
                }
                if (stack.isEmpty())
                    tf = false;
                else {
                    while (stack.peek() >= arr[i]) {
                        stack.pop();
                        sb.append("- \n");
                        if (stack.isEmpty())
                            break;
                    }
                }
            }
        }
        if (tf) System.out.println(sb.toString());
        else System.out.println("NO");

    }

}