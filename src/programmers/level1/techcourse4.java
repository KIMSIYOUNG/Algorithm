package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class techcourse4 {
    private static List<Integer> pobiList = new ArrayList<Integer>();
    private static List<Integer> croongList = new ArrayList<Integer>();

    public static int solution(int[] pobi, int[] croong){

        techcourse4.listComplete(pobi[0],pobi[1],croong[0],croong[1]);
        Integer pobimax = Collections.max(pobiList);
        Integer croongmax = Collections.max(croongList);

        System.out.println(pobiList.toString());
        System.out.println(croongList.toString());

        if(pobi[1]-pobi[0]!=1||croong[1]-croong[0]!=1||pobi[1]>400||croong[1]>400)
            return -1;
        else if(pobimax==croongmax)
            return 0;
        else
            return pobimax>croongmax?1:2;
    }

    private static void listComplete(int i2, int i11, int i, int i1) {
        String[] arr =new String[]{String.valueOf(i2), String.valueOf(i11)};
        String[] arr2 =new String[]{String.valueOf(i), String.valueOf(i1)};

        //TODO 포비 배열 완성
        for(int k=0; k<arr.length; k++){
            int sum =0;
            int multy =1;
            String[] split = arr[k].split("");
            for(int a=0; a<arr[k].length(); a++){
                sum += Integer.parseInt(split[a]);
                multy *= Integer.parseInt(split[a]);
            }
            pobiList.add(sum);
            pobiList.add(multy);
        }
        //TODO 크롱 배열 완성
        for(int k=0; k<arr2.length; k++){
            int sum =0;
            int multy =1;
            String[] split = arr2[k].split("");
            for(int a=0; a<arr2[k].length(); a++){
                sum += Integer.parseInt(split[a]);
                multy *= Integer.parseInt(split[a]);
            }
            croongList.add(sum);
            croongList.add(multy);
        }
    }

    public static void main(String[] args) {
        System.out.println(techcourse4.solution(new int[]{99,102}, new int[]{211,212}));
    }


}
