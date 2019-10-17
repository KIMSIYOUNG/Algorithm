package programmers.level1;

class Solution {
    public static String solution(int a, int b) {
        String answer = "";

        //TODO 입력된 달을 받아 일로 변환한다.
        int[] day_of_month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int days = 0;
        for(int i=1; i<a; i++){
            days += day_of_month[i-1];
        }
        //TODO 일로 변환된 값에 현재 일을 더해준다. 현재의 지나온 요일수.
        days += b;

        //TODO 1월1일은 1이니까, 7로 나누었을 때 1을 금요일을 기준으로 나누어준다.
        if(days%7==1)
            answer = "FRI";
        else if(days%7==2)
            answer = "SAT";
        else if(days%7==3)
            answer = "SUN";
        else if(days%7==4)
            answer = "MON";
        else if(days%7==5)
            answer = "TUE";
        else if(days%7==6)
            answer = "WED";
        else if(days%7==0)
            answer = "THU";

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Solution.solution(1,1));
    }
}