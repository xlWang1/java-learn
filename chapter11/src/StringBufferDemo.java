import org.junit.Test;

import java.util.HashMap;

public class StringBufferDemo {
    /*
    * 1.length():返回字符串的长度
    * 2.capacity():返回字符串所占容积大小
    * 3.charAt(int index):返回指定索引对应的字符
    * 4.indexOf(String subString)：返回指定子字符串“xxx”第一次在母字符串中出现的索引,括号中需要时String类型
    * 5.indexOf(String subString,int fromIndex))：返回指定子字符串从指定索引开始第一次在母字符串中出现的索引,括号中需要时String类型
    * 6.lastIndexOf(String subString):子字符串最后一次出现在字符串中的索引
    * 7.lastIndexOf(String subString,int fromIndex):从指定的索引开始反向搜索，返回字符串'87'在字符串s2中最后一次出现的索引
    * 8.append();在字符串末尾添加
    * 9.insert(int offest,String str):在指定位置插入str
    * 10.deleteCharAt(int index)：删除指定索引处对应的字符
    * 11.delete(int fromIndex,int endIndex):删除指定索引范围的字符
    * 12.replace(int fromIdenx,int endIndex,String str):将指定索引区间的字符替换为给定字符
    * 13.reverse()：将字符串反转
    * 14.substring(int index):从指定索引截取到末尾;
    * 15.substring(int fromIndex,int endIndex):截取字符串从指定索引开始到指定索引结尾
    * 16.getClass().getName():获取s1的变量类型
    * 17.toString():将对象信息转化为字符串
    * */
    @Test
    public void test1(){
        StringBuffer s1 = new StringBuffer("asdfghjkghjl1151adsa");
        StringBuffer s2 = new StringBuffer("ghj");
        String s3 = new String("babala");
        System.out.println(s1.length());
        System.out.println(s1.capacity());
        System.out.println(s1.charAt(2));
        System.out.println(s1.indexOf(s2.toString()));
        System.out.println(s1.indexOf(s2.toString(),7));
        System.out.println(s1.lastIndexOf(s2.toString()));
        System.out.println(s1.lastIndexOf(s2.toString(),6));
        s1.append(2+"2513ascacsdcsd1v11vd1df4ghj");
        System.out.println(s1);
        s1.insert(4,"nide");
        System.out.println(s1);
        s1.deleteCharAt(4);
        System.out.println(s1);
        s1.delete(2,10);
        System.out.println(s1);
        s1.replace(4,6,"ba");
        System.out.println(s1);
        s1.setCharAt(0, 'H');
        System.out.println(s1);
        s2.reverse();
        System.out.println(s2);
        String s4 = s1.substring(2);
        System.out.println(s4);
        String s5 = s1.substring(2,4);
        System.out.println(s5);

    }
}
