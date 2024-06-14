package TimeAndDateApi;
import org.junit.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Demo1 {
    /**
     * LocalDate、LocalTime、LocalDateTime的使用
     * LocalDate代表IOS格式（yyyy-MM-dd）的日期,可以存储 生日、纪念日等日期。
     * LocalTime表示一个时间，而不是日期。
     * LocalDateTime是用来表示日期和时间的，这是一个最常用的类之一.
     * tips:
     *      LocalDateTime使用较多
     * 		三个类的方法大同小异
     *
     * 	1.of() 设置指定的年月日时分秒,没有偏移量1900;LocalDateTime.of(2024,12,1,8,3,27)
     * 	2.getXxx()
     * 	3.with()：修改
     * 	4.plus()：添加
     * 	5.minus():减
     */
    @Test
    public void testLocalXxx(){
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);//2024-06-12
        System.out.println(localTime);//20:28:17.004651900
        System.out.println(localDateTime);//2024-06-12T20:28:17.004651900
        }
    @Test
    public void test2(){
        //of() 设置指定的年月日时分秒,没有偏移量1900
        LocalDateTime localDateTime1 = LocalDateTime.of(2024,12,1,8,3,27);
        System.out.println(localDateTime1);

    }

    @Test
    public void test3(){
        //getXxx()
        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println(localDateTime1.getMonth());
        System.out.println(localDateTime1.getDayOfMonth());
        System.out.println(localDateTime1.getDayOfWeek());
        System.out.println(localDateTime1.getDayOfYear());
        System.out.println(localDateTime1.getHour());
        System.out.println(localDateTime1.getMinute());
        System.out.println(localDateTime1.getSecond());
        System.out.println(localDateTime1.getMonthValue());
        System.out.println(localDateTime1.getNano());//纳秒
    }
    @Test
    public void test4(){
//        //with()：修改
//        LocalDateTime localDateTime1 = LocalDateTime.now();
//        LocalDateTime localDateTime2 = localDateTime1.withDayOfMonth(5);
//        LocalDateTime localDateTime3 = localDateTime1.withMonth(1);
//        System.out.println(localDateTime1);
//        System.out.println(localDateTime2);
//        System.out.println(localDateTime3);


        //plus()：添加
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime4 = localDateTime1.plusHours(3);
        System.out.println(localDateTime1);
        System.out.println(localDateTime4);

        //minus():减
        LocalDateTime localDateTime5 = localDateTime1.minusDays(3);
        System.out.println(localDateTime1);
        System.out.println(localDateTime5);

    }
}
