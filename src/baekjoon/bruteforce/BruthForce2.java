package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BruthForce2 {
    public static void main(String[] args) throws IOException {
        //TODO 어떤 수 + 그 수리의 자리 합이 입력값과 같아지는 배열을 만들기.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer input = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        //TODO 1부터 그 수까지 자리합과 값을 더해서 그 수가 나오는지 판단하기
        for(Integer i=1; i<input; i++){
            String[] split = i.toString().split("");
            Integer sum = 0;
            for(int k =0; k<split.length; k++)
                sum += Integer.parseInt(split[k]);
            if(sum+i==input)
                list.add(i);
        }
        //TODO 출력
        if (list.size() == 0) {
            System.out.println("0");
        } else {
            System.out.println(list.get(0));
        }
    }

}
