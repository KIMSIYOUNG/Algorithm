package programmers.level1;

import java.util.Scanner;

class Solution {

    public int solution(int n) {
        int answer = 0;

        //주어진 숫자의 1/2 이상 값은 약수가 될 수 없다.
        for(int i=1; i<=n/2; i++){
            if(n%i==0){
                answer += i;
            }
        }
        return answer+n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        Solution s = new Solution();
        System.out.println(s.solution(input));

    }
}
