package programmers.level1;

import java.util.Arrays;
import java.util.Stack;

public class techcourse7 {
    public static String solution(String cryptogram){
        String[] split = cryptogram.split("");
        Stack<String> stack = new Stack<String>();
        stack.push(split[0]);
        for(int i=1; i<cryptogram.length(); i++){
            if(split[i].equals(stack.peek()))
                stack.pop();
            else if(split[i]!=stack.peek())
                stack.push(split[i]);
        }
        String answer = "";
        for(int i=0; i<stack.size(); i++){
            answer += stack.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        String browoanoommnaon = techcourse7.solution("zyelleyz");
        System.out.println(browoanoommnaon);


    }

}
