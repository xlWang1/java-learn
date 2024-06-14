package Exercise.Exer1.exer1;

import java.util.Objects;

public class Student {
    /*
    *   定义学生类，属性为姓名、年龄，提供必要的getter、setter方法，构造器，toString()，equals()方法。
    *   使用ArrayList集合，保存录入的多个学生对象。
    *   循环录入的方式，1：继续录入，0：结束录入。
    *   录入结束后，用foreach遍历集合。
    * */
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}
