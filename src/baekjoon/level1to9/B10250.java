package baekjoon.level1to9;

import java.util.Scanner;

public class B10250 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TestCase = sc.nextInt();

        for(int i=0; i<TestCase; i++){
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            int floor = 0, honumber =0;
            int count = 1;
        if(H<=W){
            if(N%H!=0){
                while(N>(count*H)){
                    floor = N-count*H;
                    honumber = count+1;
                    count++;
                }
                if(honumber<10)
                    System.out.println(Integer.toString(floor)+"0"+Integer.toString(honumber));
                else
                    System.out.println(Integer.toString(floor)+Integer.toString(honumber));
            }
            else if (N%H==0){
                floor = N / H;
                honumber = H;

                if(honumber<10)
                    System.out.println(Integer.toString(floor)+"0"+Integer.toString(honumber));
                else
                    System.out.println(Integer.toString(floor)+Integer.toString(honumber));

            }
        }else if(H>W){
            if(N%H!=0){
                while(N>(count*H)){
                    floor = N-count*H;
                    honumber = N%H;
                    count++;
                }
                if(honumber<10)
                    System.out.println(Integer.toString(count)+"0"+Integer.toString(honumber));
                else
                    System.out.println(Integer.toString(count)+Integer.toString(honumber));

            }else if(N%H==0){
                floor = N/H;
                honumber = H;
                if(honumber<10)
                    System.out.println(Integer.toString(floor)+"0"+Integer.toString(honumber));
                else
                    System.out.println(Integer.toString(floor)+Integer.toString(honumber));

            }
            }

        }

    }

}



