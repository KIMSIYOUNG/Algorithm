package programmers.level1;

class Solution {
    static boolean solution(String s) {

        String input = s.toUpperCase();
        String[] split = input.split("");
        int countP =0;
        int countY =0;
        for(int i=0; i<split.length; i++){
            if(split[i].equals("P"))
                countP++;
            else if(split[i].equals("Y"))
                countY++;
        }
        return countP == countY;

        //return s.char().filter(e -> 'P'==e).count() == s.char().filter(e-> 'Y'==e).count();

    }


    public static void main(String[] args) {
        System.out.println(Solution.solution("Pyy"));
    }
}