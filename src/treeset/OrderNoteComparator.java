package treeset;

import java.util.Comparator;

public class OrderNoteComparator implements Comparator <student> {

    @Override  // hazýr olan compare fonksiyonunu implements olduðu için overrite ettik.
    public int compare(student o1, student o2) {
        return o1.getStudentNote()-o2.getStudentNote();
    }
}
