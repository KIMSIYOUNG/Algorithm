import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws ParseException {
        String start = "10:59:10";
        String end = "10:59:20";
        SimpleDateFormat s = new SimpleDateFormat("YY:mm:ss");
        Date d = new Date();
        Date start2 = s.parse(start);
        Date end2 = s.parse(end);
        System.out.println(start2.getTime());
        System.out.println(end2.getTime());
        System.out.println(start2.getTime()-end2.getTime());
        System.out.println(end2.getTime()-start2.getTime());


    }


}
