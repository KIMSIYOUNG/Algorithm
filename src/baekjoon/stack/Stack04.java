package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            //TODO 변수 선언
            String input = br.readLine();
            if(input.equals("."))
                return;
            Stack stack = new Stack();
            boolean result = true;
            for(char value : input.toCharArray()){
                if(value=='('||value=='[')
                    stack.push(value);
                else if(value ==')')
                    if(stack.isEmpty() || (char)stack.pop()!='('){
                        result = false;
                        break;
                    }
                else if(value ==']')
                    if(stack.isEmpty()||(char)stack.pop()!=']'){
                        result = false;
                        break;
                    }

                if(!stack.isEmpty())
                    result = false;
            }
            if(result)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
