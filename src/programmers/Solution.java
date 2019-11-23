package programmers;

class Solution1 {
    public static int solution(int n) {
        int first = 0;
        int second = 1;
        int result =1;
        for(int i=2; i<=n; i++){
            result = (first+second)%1234567;
            first = second%1234567;
            second = result%1234567;
        }
        return result;


    }

    public static void main(String[] args) {
        int solution = solution(5);
        System.out.println(solution);
    }

}
