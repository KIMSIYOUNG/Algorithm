package baekjoon.stack;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stack01 {
    private static List<Integer> arr = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<=T; i++){
            String[] split = sc.nextLine().split(" ");
            if(split[0].equals("top"))
                System.out.println(Stack01.top());
            else if(split[0].equals("empty"))
                System.out.println(Stack01.empty());
            else if(split[0].equals("pop"))
                System.out.println(Stack01.pop());
            else if(split[0].equals("size"))
                System.out.println(Stack01.size());
            else if(split[0].equals("push")){
                String s = split[1];
                Stack01.push(Integer.parseInt(s));
            }
        }
    }

    private static void push(int parseInt) {
        arr.add(parseInt);
    }

    private static int size() {
        return arr.size()<=0?0:arr.size();

    }

    private static int pop() {
        if(arr.size()<=0)
            return -1;
        else{
            Integer result = arr.get(arr.size() - 1);
            arr.remove(result);
            return result;
        }
    }

    private static int empty() {
        return arr.size()<=0?1:0;
    }

    private static int top() {
        return arr.size()<=0?-1:arr.get(arr.size()-1);
    }

}
