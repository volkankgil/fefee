package treeset;

import java.util.Comparator;

public class OrderNameComparator implements Comparator<student> {
    @Override
    public int compare(student o1, student o2) {
        return o1.getStudentName().compareTo(o2.getStudentName());
    }
}
