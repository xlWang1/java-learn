package TimeAndDateApi;

import org.junit.Test;

public class Students implements Comparable{
    //java.lang.Comparable自然排序
    //java.util.Comparator定制排序

    //java.lang.Comparable自然排序
    private int id;
    private String name;
    private int score;
    private int age;

    public Students(int id, String name, int score, int age) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", age=" + age +
                '}';
    }
    @Override
    public int compareTo(Object o) {
        Students student = (Students)o;
        return this.score - student.score;
    }
}
