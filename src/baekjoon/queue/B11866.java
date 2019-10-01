package baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B11866{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());


        for(int i=0; i<N; i++){
            q.add(i+1);
        }

        String result = "<";
        while(!q.isEmpty()){
            for(int i=0; i<K-1; i++){
                int number = q.poll();
                q.offer(number);
            }
            result +=q.poll()+", ";
        }
        String realresult = result.substring(0, result.length()-2);
        realresult += ">";
        System.out.println(realresult);




    }


}