package programmers.level1;

class Solution {
    public static int solution(int n) {
        int answer = 0;
        for(int i=2; i<=n; i++) {
            boolean flag = true;
            for(int j=2; j<=Math.sqrt(i); j++) {
                if(i%j==0) {
                    flag = false;
                    break;
                }
            }
            if(flag==true) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int solution = Solution.solution(5);
        System.out.println(solution);
    }
}