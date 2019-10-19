package baekjoon.level1to9;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] split = bf.readLine().toUpperCase().split("");
        Map<String, Integer> countMap = new HashMap<>();
        for(int i=0; i<split.length; i++){
            countMap.put(split[i], countMap.getOrDefault(split[i], 0)+1);
        }
        Integer max = Collections.max(countMap.values());


        if(countMap.values().stream().filter(x->x==max).count()!=1){
            System.out.println("?");
        }else{
            countMap.entrySet().stream().filter(x->max.equals(x.getValue())).forEach(x->System.out.println(x.getKey()));
        }

    }
}