package programmers.level2;

class Solution {
    public static String solution(int n) {
        String answer = "";
        String[] result = new String[]{"4", "1", "2"};
        while (n > 0) {
            answer = result[n % 3] + answer;
            n = (n - 1) / 3;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Solution.solution(4));
    }
}