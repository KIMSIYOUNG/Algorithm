package baekjoon.studymore;

import java.io.*;

public class B11729 {
    public static BufferedReader br;
    public static BufferedWriter bw;

    public static void hanoi(int n, int from, int by, int to) throws IOException {
        if (n == 0) {
            return;
        }

        hanoi(n - 1, from, to, by);
        bw.write(from + " " + to + "\n");
        hanoi(n - 1, by, from, to);
    }
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int count = (int) Math.pow(2, N) - 1;

        System.out.println(count);
        hanoi(N, 1, 2, 3);

        bw.flush();
        br.close();
        bw.close();
    }

}