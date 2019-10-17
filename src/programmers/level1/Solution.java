package programmers.level1;


import javax.print.event.PrintEvent;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0 ;
        int lostSelf = 0;
        int count =0;

        //TODO 잃어버렸는데 자기꺼는 있는 학생
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i]==reserve[j]){
                    lostSelf++;
                    lost[i]=-1;
                    reserve[j]=-1;
                    break;
                }
            }
        }
        //TODO 잃어버린 애들한테 빌려주기
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(Math.abs(lost[i]-reserve[j])==1){
                    count++;
                    reserve[j]=-1;
                    break;
                }
            }
        }
        //TODO 전체 합산하기.
        answer = n -lost.length +lostSelf + count;
        return answer;


    }
}

