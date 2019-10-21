package baekjoon.arrangement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Arrange2750 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<T; i++){
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        for(int i:arr)
            System.out.println(i);
    }
}
