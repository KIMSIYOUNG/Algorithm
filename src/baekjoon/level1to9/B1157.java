package baekjoon.level1to9;


//시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
//        2 초	128 MB	40612	15123	12154	37.846%
//        문제
//        알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
//
//        입력
//        첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
//
//        출력
//        첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

import java.util.Scanner;

public class B1157 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next().trim().toUpperCase();
        int[] arr = new int[26];
        int max = 0;
        char result = '?';


        for(int i =0; i<word.length(); i++){
            arr[word.charAt(i)-65]++;
            if(max<arr[word.charAt(i)-65]){
                max = arr[word.charAt(i)-65];
                result = word.charAt(i);
            }else if(max ==arr[word.charAt(i)-65]){
                result = '?';
            }
        }
        System.out.println(result);


    }
}
