package aboutjava.javautilStudy;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * Java Date 및 자바에서 기본적으로 제공하는 날짜관련 API가 부족하거나
 * 불편한 부분이 많았기 때문에 자바 8부터 지원하는 Java.time을 지원하기 시작함.
 */
public class JavaTimePackage {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDate sometime = LocalDate.of(2012, Month.DECEMBER, 10);
        System.out.println(sometime);
        LocalTime of = LocalTime.of(17, 18);
        System.out.println(of);
        LocalTime parse = LocalTime.parse("10:15:30");
        System.out.println(parse);
        LocalDate localDate = now.toLocalDate();
        System.out.println(localDate);
        System.out.println(now.getMonth());
        System.out.println(now.getMonthValue());
        LocalDateTime now1 = LocalDateTime.now();
        Month month = now.getMonth();
        System.out.println(month);
    }
}
