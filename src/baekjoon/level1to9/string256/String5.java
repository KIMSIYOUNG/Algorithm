package baekjoon.level1to9.string256;

import java.util.*;

public class String5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String wordUpper = word.toUpperCase();
        String[] split = wordUpper.split("");
        //TODO 알파벳 배열을 생성
        String[] alphabet = new String[26];
        for(int i=0; i<alphabet.length; i++)
            alphabet[i]= String.valueOf((char)(65+i));
        //TODO 각 알파벳의 개수를 체크할 배열 생성
        int[] count = new int[26];
        //TODO 입력받은 문자들을 잘라, 개수를 체크해 배열에 담기
        for(int i=0; i<split.length; i++){
            for(int k=0; k<alphabet.length; k++){
                if(split[i].equals(alphabet[k]))
                    count[k] += 1;
            }
        }
        //TODO 갯수를 비교해 출력하기
        int max = count[0];
        int maxCount =0;
        for(int i=1; i<count.length; i++){
            if(max<count[i]){
                max = count[i];
                maxCount=2;
            }else if(max ==count[i])
                maxCount=1;
        }
        //TODO 맥스값에 해당하는 알파벳의 인덱스 찾기
        if(maxCount==1)
            System.out.println('?');
        else{
            List<Integer> list = new ArrayList<Integer>();
            for(int i=0; i<count.length; i++)
                list.add(count[i]);
            int i = list.indexOf(max);
            System.out.println(alphabet[i]);
        }

    }
}
