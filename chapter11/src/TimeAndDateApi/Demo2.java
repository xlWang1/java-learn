package TimeAndDateApi;

import org.junit.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Demo2 {
    /*
    * 持续日期/时间：Period和Duration
    * 持续时间：Duration，用于计算两个“时间”间隔
    * 日期间隔：Period，用于计算两个“日期”间隔
    *
    * */

    @Test
    public void testDuration(){
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime pretime = LocalDateTime.of(2022,7,30,14,2,7);
        Duration between = Duration.between(pretime,localDateTime);
        System.out.println(between.toDays());
    }


    @Test
    public void testPeriod(){
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2021, 4, 27);

        Period between = Period.between(localDate1, localDate);
        System.out.println(between);//P1D

        System.out.println(between.getYears());//0
        System.out.println(between.getMonths());//0
        System.out.println(between.getDays());//1
        System.out.println(between.getChronology());//ISO
        System.out.println(between.getUnits());//[Years, Months, Days]
    }
}
