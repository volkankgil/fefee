package treeset;

import java.util.Comparator;

public class OrderNoteComparator implements Comparator <student> {

    @Override  // haz�r olan compare fonksiyonunu implements oldu�u i�in override ettik.
    public int compare(student o1, student o2) {
        return o1.getStudentNote()-o2.getStudentNote();
    }
}
