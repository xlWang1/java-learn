package Exercise.Exer1.exer2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class listTest {
    /*
    *   1、请定义方法public static int listTest(Collection list,String s)统计集合中指定元素出现的次数

        2、创建集合，集合存放随机生成的30个小写字母

        3、用listTest统计，a、b、c、x元素的出现次数
    *
    *
    * */

    public static void main(String[] args) {
        Collection coll = new ArrayList();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            coll.add((char)(random.nextInt(26)+97)+"");

        }
        System.out.println(coll);
        System.out.println("a:"+listTest(coll,"a"));
        System.out.println("z:"+listTest(coll,"z"));

    }

    public static int listTest(Collection list,String s){
        int count = 0;
        for (Object O:list
             ) {
            if (O.equals(s)){
                count++;
            }
        }
        return count;
    }
}
