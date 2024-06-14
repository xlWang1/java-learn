package TimeAndDateApi;

import java.util.Comparator;

public class StudentsComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Students student1 = (Students)o1;
        Students student2 = (Students)o2;
        int res = (int) (student1.getScore()-student2.getScore());
        return res !=0 ? res:student2.getId()-student1.getId();
    }
}
