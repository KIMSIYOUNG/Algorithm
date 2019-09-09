import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a= sc.nextDouble();
        String astr = String.valueOf(a);
        astr.indexOf(".");
        astr.substring(astr.indexOf(".")+1,astr.length());

        System.out.println((int)a);
        System.out.println(astr.substring(astr.indexOf(".")+1,astr.length()));

    }
}