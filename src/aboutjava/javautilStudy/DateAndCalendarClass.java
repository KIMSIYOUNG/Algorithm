package aboutjava.javautilStudy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Date클래스는 지역화를 고려하지 않고, 현재 지원중단되고 있는 메서드들이 많이 있다.
 * 이를 대체하여 Calendar라는 클래스가 존재한다. 달력의 이동또한 가능하며
 * 다양한 메서드를 지원하고 있음. 필요할 때 학습하기
 */
public class DateAndCalendarClass {

    public static void main(String[] args) throws ParseException {
        //Date
        Date date = new Date();
        System.out.println(date.toString());
        SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");
        String format = df.format(date);
        System.out.println(format);
        System.out.println(date.getTime());
        long l = System.currentTimeMillis();
        System.out.println(l);
        System.out.println(l-date.getTime());

        Calendar cal = Calendar.getInstance();
        System.out.println(
                cal.get(Calendar.YEAR)+"년 "+
                cal.get(Calendar.MONTH)+"월 "+
                cal.get(Calendar.DAY_OF_MONTH)+"일 "+
                cal.get(Calendar.HOUR_OF_DAY)+"시 "+
                cal.get(Calendar.MINUTE)+"분 "+
                cal.get(Calendar.SECOND)+"초 "
        );
        cal.add(Calendar.HOUR_OF_DAY,3);
        System.out.println(
                cal.get(Calendar.YEAR)+"년 "+
                        cal.get(Calendar.MONTH)+"월 "+
                        cal.get(Calendar.DAY_OF_MONTH)+"일 "+
                        cal.get(Calendar.HOUR_OF_DAY)+"시 "+
                        cal.get(Calendar.MINUTE)+"분 "+
                        cal.get(Calendar.SECOND)+"초 "
        );
    }
}
