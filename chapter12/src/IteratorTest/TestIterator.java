package IteratorTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
    /*
    * public Iterator iterator(): 获取集合对应的迭代器，用来遍历集合中的元素的。
    * public E next():返回迭代的下一个元素。
    * public boolean hasNext():如果仍有元素可以迭代，则返回 true
    * 注意：在调用it.next()方法之前必须要调用it.hasNext()进行检测。若不调用，且下一条记录无效，直接调用it.next()会抛出NoSuchElementException异常
    * void remove():
    * */

    @Test
    public void test(){
        Collection coll = new ArrayList();
        coll.add("小李广");
        coll.add("扫地僧");
        coll.add("石破天");

        Iterator iterator = coll.iterator();

//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next()); //报NoSuchElementException异常
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    @Test
    public void removetest(){
        Collection coll = new ArrayList();
        coll.add(1);
        coll.add(2);
        coll.add(3);
        coll.add(4);
        coll.add(5);
        coll.add(6);
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            if((Integer)iterator.next() % 2 == 0){
                iterator.remove();
            }
        }
        System.out.println(coll);

    }
}
