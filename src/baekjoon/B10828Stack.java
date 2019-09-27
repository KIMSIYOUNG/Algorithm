package baekjoon;

import java.util.Scanner;

public class B10828Stack {
    private int max; //배열의 개수
    private int ptr; //현재 배열에 들어 있는 정수의 수
    private int[] stk = new int[100]; //배열본체

    public B10828Stack() {
        ptr =0;
        max = 10000;
        stk = new int[max];
    }

    void push(Integer x){
        stk[ptr++]=x;
    }
    int pop(){
        if(ptr<=0)
            return -1;
        else
            return stk[--ptr];
    }
    int size(){
        return ptr<=0?0:ptr;
    }
    int empty(){
        return ptr<=0?1:0;
    }
    int top(){
        return ptr<=0?-1:stk[ptr-1];
    }

    public static void main(String[] args) {
        B10828Stack s = new B10828Stack();
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        for(int i=0; i<testcase+1; i++){
            String input = sc.nextLine();
            String[] input_arr = input.split(" ");

            if(input_arr[0].equals("push"))
                s.push(Integer.parseInt(input_arr[1]));
            else if(input_arr[0].equals("pop".trim()))
                System.out.println(s.pop());
            else if(input_arr[0].equals("size".trim()))
                System.out.println(s.size());
            else if(input_arr[0].equals("empty".trim()))
                System.out.println(s.empty());
            else if(input_arr[0].equals("top".trim()))
                System.out.println(s.top());
        }


    }

}
