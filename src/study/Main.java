package study;


import java.util.Scanner;

//Case #1: 2
//Case #2: 5
//Case #3: 7
//Case #4: 17
//Case #5: 7
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Test = sc.nextInt();
        for(int i =1; i<=Test; i++){
            System.out.println("Case # "+i+": "+(sc.nextInt()+sc.nextInt()));
        }


    }

}
