package baekjoon.level1to9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B1316 {
    static boolean flag;
        public static void main(String[] args) throws IOException {
            String str;

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int cnt = 0, n = Integer.parseInt(br.readLine());
            while(n-- > 0) {
                List list = new ArrayList<>();
                flag = true;

                str = br.readLine();
                str.chars().mapToObj(a -> (char)a).forEach(a -> { if(list.isEmpty() || !list.contains(a)) list.add(a);
                else if(!list.get(list.size()-1).equals(a)) flag = false;});
                if(flag) cnt++;
            }
            System.out.print(cnt);
        }
}

