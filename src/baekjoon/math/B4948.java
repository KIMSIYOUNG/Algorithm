package baekjoon.math;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B4948 {

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        st = new StringTokenizer(br.readLine());
        int input = Integer.parseInt(st.nextToken());
        List<Integer> inputList = new ArrayList<>();
        inputList.add(input);

        while(input != 0) {
            st = new StringTokenizer(br.readLine());
            input = Integer.parseInt(st.nextToken());
            inputList.add(input);
        }

        for(int i=0; i<inputList.size()-1; i++) {
            int primeNumCount = inputList.get(i); // 범위 내의 숫자 갯수
            int startNum = inputList.get(i);

            for(int j=startNum+1; j<=2*inputList.get(i); j++) {
                double root = Math.sqrt(j);
                int divide = 2;
                if(j == 1) {
                    primeNumCount--;
                }
                while(divide<= root) { // 제곱근을 넘지 않는다.

                    if(j%divide == 0) { // 소수가 아닐 때
                        primeNumCount--; // 범위 내의 숫자 갯수를 하나씩
                        break;
                    }
                    divide++;
                }

            }
            bw.write(String.valueOf(primeNumCount));
            bw.newLine();
            bw.flush();
        }


    }

}