package programmers.level1;

import java.util.Arrays;

class techcourse1{
    public static int[] solution(int money){
        int[] money_sort = new int[]{50000,10000,5000,1000,500,100,50,10,1};
        int[] result = new int[9];
        for(int i=0; i<money_sort.length; i++){
            result[i]=money / money_sort[i];
            money %= money_sort[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] solution = techcourse1.solution(1624);
        System.out.println(Arrays.toString(solution));
    }
}