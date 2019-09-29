package baekjoon.queue;

import java.util.Scanner;

public class B10845Queue {
    private int max;
    private int data_amount;
    private int front;
    private int back;
    private int[] queue;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        B10845Queue s = new B10845Queue(testcase);

        for(int i=0; i<testcase+1; i++){
            String input = sc.nextLine();
            String[] input_arr = input.split(" ");

            if(input_arr[0].equals("push"))
                s.push(Integer.parseInt(input_arr[1]));
            else if(input_arr[0].equals("front"))
                System.out.println(s.front());
            else if(input_arr[0].equals("back"))
                System.out.println(s.back());
            else if(input_arr[0].equals("size"))
                System.out.println(s.size());
            else if(input_arr[0].equals("empty"))
                System.out.println(s.empty());
            else if(input_arr[0].equals("pop"))
                System.out.println(s.pop());
        }

    }

    public B10845Queue(int capacity) {
        max = capacity;
        queue = new int[max];

        data_amount = front = back = 0;
    }

    public void push(int x){
        queue[back++] = x;
        data_amount++;
    }
    public int pop(){
        if(data_amount<=0)
            return -1;
        int x = queue[front++];
        data_amount--;
        return x;
    }
    public int size(){
        return data_amount;
    }
    public int empty(){
        return data_amount<=0?1:0;
    }
    public int front(){
        return data_amount<=0?-1:queue[front];
    }
    public int back(){
        return data_amount<=0?-1:queue[back-1];
    }

}
