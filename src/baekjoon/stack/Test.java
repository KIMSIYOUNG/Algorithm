package baekjoon.stack;

import java.io.*;
import java.util.Stack;

public class Test {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String input = br.readLine();

            //입력중단
            if(input.equals(".")){
                bw.flush();
                bw.close();
                return;
            }
            Stack stack  = new Stack();
            boolean result = true;

            for(char one : input.toCharArray()){
                if(one=='('|| one=='[')
                    stack.push(one);
                else if(one ==')'){
                    if(stack.isEmpty()||(char)stack.pop()!='('){
                        result = false;
                        break;
                    }
                }else if(one ==']'){
                    if(stack.isEmpty() || (char)stack.pop()!='['){
                        result = false;
                        break;
                    }
                }
            }

            if(!stack.isEmpty())
                result =false;

            if(result==false)
                bw.write("no\n");
            else
                bw.write("yes\n");




        }


    }
}
