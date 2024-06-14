package ForEachTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class TestForeach {
    /*
    * for(元素的数据类型 局部变量 : Collection集合或数组){
  	    //操作局部变量的输出操作
        }
        //这里局部变量就是一个临时变量，自己命名就可以
    *
    *
    * */
    @Test
    public void test01(){
        Collection coll = new ArrayList();
        coll.add("小李广");
        coll.add("扫地僧");
        coll.add("石破天");
        //foreach循环其实就是使用Iterator迭代器来完成元素的遍历的。
        for (Object o:coll) {
            System.out.println(o);

        }
    }
}
