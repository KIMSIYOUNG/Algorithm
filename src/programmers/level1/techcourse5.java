package programmers.level1;

public class techcourse5 {
    public static int solution(int number){
        int count =0;
        for(int i=1; i<=number; i++){
            String i_str = String.valueOf(i);
            for(int k=0; k<i_str.length(); k++){
                if(i_str.charAt(k)=='3'||i_str.charAt(k)=='6'||i_str.charAt(k)=='9')
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int solution = techcourse5.solution(33);
        System.out.println(solution);
    }
}
