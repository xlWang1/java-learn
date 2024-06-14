import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AndAllTest {

    //add（）与addAll（）
    //add(E obj)：添加元素对象到当前集合中
    //addAll(Collection other):添加other集合中的所有元素对象到当前集合中
    @Test
    public void test1(){
        Collection list1 = new ArrayList();
        list1.add("q");
        list1.add("s");
        Collection list2 = new ArrayList();
        list2.add("q");
        list2.add("s");
        list2.add("d");
        Collection list3 = new ArrayList();
        list3.add("q");
        list3.add("s");
        list1.add(list2);
        System.out.println(list1);//[q, s, [q, s, d]]
        list3.addAll(list2);
        System.out.println(list3);//[q, s, q, s, d]

    }

}
