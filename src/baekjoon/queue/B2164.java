package baekjoon.queue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class B2164 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        Queue queue = new LinkedList();
        for(int i=1; i<=input; i++){
            queue.add(i);
        }
        while(true){
            if(queue.isEmpty())
                break;
            if(queue.size()==2){
                queue.remove();
                break;
            }
            if(queue.size()==1){
                break;
            }
            queue.remove();
            int a = (int) queue.remove();
            queue.add(a);
        }
        System.out.println(queue.peek());
    }
}
