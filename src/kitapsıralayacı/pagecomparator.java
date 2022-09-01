package kitapsýralayacý;

import java.util.Comparator;

public class pagecomparator implements Comparator<book> {
    @Override
    public int compare(book o1, book o2) {
        return o1.getPagenumber()-o2.getPagenumber();
    }
}
