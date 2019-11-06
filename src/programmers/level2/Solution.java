package programmers.level2;

class Solution {
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for(int i=0; i<answer.length;i++){
            for(int j=0; j<answer[0].length;j++){
                for(int k=0; k<arr1[0].length;k++){
                    answer[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
       for (int i = 0; i < answer.length; i++) {
              for (int j = 0; j < answer[i].length; j++) {
                  System.out.print(answer[i][j] + " "); // 열 출력
              }
              System.out.println(); // 행 출력
          }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1,4},{3,2},{4,1}},new int[][]{{3,3},{3,3}}));
    }
}