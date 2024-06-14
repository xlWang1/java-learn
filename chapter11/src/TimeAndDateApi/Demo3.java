package TimeAndDateApi;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Demo3 {

    //TemporalAdjuster:时间校正器 - 计算时间差
    @Test
    public void test(){
        TemporalAdjuster temporalAdjuster = TemporalAdjusters.next(DayOfWeek.SUNDAY);
        LocalDateTime nextsunday = LocalDateTime.now().with(temporalAdjuster);
        System.out.println(nextsunday);

        //获取下一个工作日
        LocalDate localDate = LocalDate.now();
        if(localDate.getDayOfWeek().equals(DayOfWeek.FRIDAY)){
            localDate = localDate.plusDays(3);
        }if(localDate.getDayOfWeek().equals(DayOfWeek.SATURDAY)){
            localDate = localDate.plusDays(2);
        }else {
            localDate = localDate.plusDays(1);
        }
        System.out.println(localDate);
    }



}
