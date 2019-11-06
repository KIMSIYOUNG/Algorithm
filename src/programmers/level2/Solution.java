package programmers.level2;

class Solution {
    public static int solution(int n) {
        int count = 0;
        int i=1;
        int answer = i;
        int k=i+1;

        while(true){
            if(i==n){
                count++;
                break;
            }
            answer += k;
            if(answer==n){
                count++; i++;
                k = i+1; answer = i;
            }
            else{
                k++;
                if(answer>n){
                    i++; k = i+1;
                    answer = i;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(15));
    }
}