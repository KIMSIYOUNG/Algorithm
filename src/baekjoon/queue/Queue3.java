package baekjoon.queue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Queue3 {
    public static void main(String[] args) throws IOException {
        //TODO 1,2,3,4,5,6,7 -> 3,6,2,5,1,7,4
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++)
            queue.add(i);
        //TODO remove & push
        sb.append("<");
        while (queue.size() > 0) {
            for (int i = 0; i < K - 1; i++) {
                queue.add(queue.poll());
            }
            Integer remove = queue.poll();
            if (queue.size() == 0) {
                sb.append(remove);
            } else {
                sb.append(remove + ", ");
            }

        }
        sb.append(">");
        System.out.println(sb.toString());


    }
}
