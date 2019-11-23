package aboutjava;

import java.util.Arrays;

class Solution {
    public static int[] solution(String[] history) {
        //TODO 현재 냉장고 상태와 필요한 재료의 배열
        int[] needs = new int[]{4, 50, 10, 10, 4};
        int[] ingredients = new int[]{5, 100, 10, 5, 2};
        int[] needingredient = new int[5];
        int[] answer = new int[history.length];
        //TODO 예외처리 (둘의 최소값과 최대값보다 작거나 크면)
        for (int i = 0; i < history.length; i++) {
            double input = Double.parseDouble(history[i]);
            if (input < 1 || input > 2.5)
                return new int[]{-1};
        }
        //TODO 각각 필요한 재료를 구한다.
        for (int i = 0; i < history.length; i++) {
            int sum = 0;
            for (int k = 0; k < needingredient.length; k++) {
                needingredient[k] = (int) (Double.parseDouble(history[i]) * needs[k]);
            }
            //TODO 현재 재료에서 필요한 재료를 뺀 값이 음수일 때 재료를 추가해주고, 금액을 올린다.
            for (int x = 0; x < ingredients.length; x++) {
                double v = Double.parseDouble(history[i]);
                if(x==4&& v -(int)v!=0){
                    ingredients[x] = ingredients[x] - needingredient[x]/2;
                }else{
                    ingredients[x] = ingredients[x] - needingredient[x];
                }
                while (ingredients[x] < 0) {
                    if (x == 0) {
                        ingredients[x] += 10;
                        sum += 10000;
                    } else if (x == 1) {
                        ingredients[x] += 100;
                        sum += 3000;
                    } else if (x == 2) {
                        ingredients[x] += 30;
                        sum += 1000;
                    } else if (x == 3) {
                        ingredients[x] += 50;
                        sum += 2000;
                    } else if (x == 4) {
                        ingredients[x] += 10;
                        sum += 1000;
                    }
                }
                answer[i] = sum;
            }
        }

        return answer;
    }
    //TODO 테스트용 메인메서드입니다.
    public static void main(String[] args) {
        int[] solution = solution(new String[]{"1.0", "2.0", "1.5","2.5","1.5","2.0"});
        System.out.println(Arrays.toString(solution));
    }
}