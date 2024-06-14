package Exercise.Exer1.exer1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
    /*
    *使用ArrayList集合，保存录入的多个学生对象。
    *循环录入的方式，1：继续录入，0：结束录入。
    *录入结束后，用foreach遍历集合。
    *
    * */
    public static void main(String[] args) {
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        List stulist = new ArrayList();
        while (flag == true){
            System.out.println("1：继续录入\n0：结束录入");
            String order = input.next();
            if (order.equals("1")){
                System.out.println("请输入姓名:");
                String name = input.next();
                System.out.println("请输入年龄:");
                int age = input.nextInt();
                Student student = new Student(name,age);
                stulist.add(student);
            }else if (order.equals("0")) {
                flag = false;
                for (Object stu : stulist) {
                    System.out.println(stu);
                }
            }else{
                System.out.println("非法输入");
            }

        }


    }



}
