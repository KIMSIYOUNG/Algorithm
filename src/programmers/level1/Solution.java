package programmers.level1;

class Solution {
    public static String solution(int n) {
        String subak = "수박";
        String baksu = "박수";
        String answer ="";
        if(n%2==0){
            for(int i=0; i<n/2; i++){
                answer += subak;
            }
        }else{
            answer ="수";
            for(int i=0; i<n/2; i++)
                answer += baksu;
        }
        return answer;
    }

    public static void main(String[] args) {
        String solution = Solution.solution(7);
        System.out.println(solution);
    }
}