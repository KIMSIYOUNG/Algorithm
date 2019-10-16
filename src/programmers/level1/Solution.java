package programmers.level1;


class Solution {
    public boolean solution(String s) {
        //TODO case 1)
//        int length = s.length();
//
//        if(length !=4 && length !=6)
//            return false;
//
//        for (int i = 0; i < s.length(); i++) {
//            if ('0' > s.charAt(i) || s.charAt(i) > '9')
//                return false;
//            }
//        return true;
        //TODO case 2)
        int length = s.length();
        if(length==4 || length==6){
            try{
                int a = Integer.parseInt(s);
                return true;
            }catch (NumberFormatException e){
                return false;
            }
        }else
            return false;
    }
}