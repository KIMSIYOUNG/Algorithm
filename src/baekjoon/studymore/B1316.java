package baekjoon.studymore;

/*

시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
2 초	128 MB	20664	10413	9141	51.935%
문제
그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.

출력
첫째 줄에 그룹 단어의 개수를 출력한다.

 */

import java.util.Scanner;

public class B1316 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int count = 0;

        for (int i = 0; i < testCase; i++) {
            String input = sc.next();

            char[] input_chr = input.toCharArray();

            for (int j = 0; j < input_chr.length; j++) {
                for(int k = j+1; k<input_chr.length; k++){
                    if(input_chr[j]==input_chr[k]){
                        int sum =0;
                        for(int a=(j+1); a<k; a++){
                            if(input_chr[a]==input_chr[k]){
                                sum++;
                                if(sum==(k-j-1)){
                                    count++;
                                }
                            }
                        }
                    }
                }
            }

        }

    }
}
