package baekjoon.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B17298Stack {

        public static void main(String[] args) throws Exception{


            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(reader.readLine());
            StringBuilder sb = new StringBuilder();

            int n = Integer.parseInt(reader.readLine());

            int [] a = new int[n];
            for(int i=0; i<n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            Stack<Integer> s = new Stack<>();
            int [] ans = new int[n];
            for(int i=n-1; i>=0; i--) {
                while(!s.isEmpty() && s.peek() <= a[i]) {
                    s.pop();
                }
                if(s.isEmpty()) {
                    ans[i] = -1;
                } else {
                    ans[i] = s.peek();
                }
                s.push(a[i]);
            }
            for(int k : ans) {
                sb.append(k+" ");
            }
            System.out.print(sb.toString());
        }
    }
