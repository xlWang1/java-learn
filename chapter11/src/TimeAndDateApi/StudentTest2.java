package TimeAndDateApi;

public class StudentTest2 {
    //定制排序
    public static void main(String[] args) {
        Students[] arr = new Students[5];
        arr[0] = new Students(3, "张三", 90, 23);
        arr[1] = new Students(1, "熊大", 100, 22);
        arr[2] = new Students(5, "王五", 75, 25);
        arr[3] = new Students(4, "李四", 85, 24);
        arr[4] = new Students(2, "熊二", 85, 18);


        System.out.println("按照成绩排序");
        StudentsComparator sc = new StudentsComparator();
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (sc.compare(arr[j], arr[j + 1]) < 0) {
                    Students temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

