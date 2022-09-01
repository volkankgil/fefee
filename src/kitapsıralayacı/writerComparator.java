package kitapsýralayacý;

import java.util.Comparator;

public class writerComparator implements Comparator<book> {


    @Override
    public int compare(book o1, book o2) {
        return o1.getWriterName().compareTo(o2.getWriterName());
    }
}
