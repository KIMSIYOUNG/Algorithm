package baekjoon.stack;

import java.util.*;
import java.io.*;


public class B4949balnce {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String input = br.readLine();

            if(input.equals(".")) {
                bw.flush();
                bw.close();
                return;
            }

            Stack stack = new Stack();
            boolean result = true;

            // 한 글자씩 검사
            for(char one : input.toCharArray()) {
                if(one == '(' || one == '[')
                    stack.push(one);
                else if(one == ')') {
                    if(stack.isEmpty() || (char)stack.pop() != '(') {
                        result = false;
                        break;
                    }
                } else if(one == ']') {
                    if(stack.isEmpty() || (char)stack.pop()!='[') {
                        result = false;
                        break;
                    }
                }
            }

            // 모든 검사가 끝났는데 스택이 비어있지 않다면 균형잡히지 않은 것
            if(!stack.isEmpty())
                result = false;

            if(result == false)
                bw.write("no\n");
            else
                bw.write("yes\n");
        }
    }
}