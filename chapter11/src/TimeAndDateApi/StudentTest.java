package TimeAndDateApi;

import org.junit.Test;

public class StudentTest {
    @Test
    public void test1(){
        Students[] arr = new Students[5];
        arr[0] = new Students(3,"张三",90,23);
        arr[1] = new Students(1,"熊大",100,22);
        arr[2] = new Students(5,"王五",75,25);
        arr[3] = new Students(4,"李四",85,24);
        arr[4] = new Students(2,"熊二",85,18);
        //比较单个学生
        System.out.println(arr[2].compareTo(arr[0]));//-15

        System.out.println(arr[1]);
        System.out.println("=================================================");

        //比较所有学生（按照成绩排序）

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <arr.length-1 ; j++) {
                if (arr[i].compareTo(arr[j]) < 0){
                    Students temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]  = temp;
                }
            }

        }
        for (int a = 0; a < arr.length; a++) {
            System.out.println(arr[a]);

        }
    }
}
