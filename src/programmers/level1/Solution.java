package programmers.level1;

class Solution {
    public static void main(String[] args) {
        System.out.println(Solution.solution(25));
    }
    public static long solution(long n) {
        double sqrt = 0;
        sqrt = Math.sqrt(n);
        //TODO 소수점이 존재한다는 것은 int형으로 타입변환한 값으로 나눴을 때 0이상이라는 의미 == 정수 제곱근이 존재하지 않는다.
        return (sqrt%(int)sqrt==0)?(long) Math.pow(sqrt+1,2):-1;
    }
}