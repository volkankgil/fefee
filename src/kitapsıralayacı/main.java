package kitapsýralayacý;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class main {
    public static void main(String[] args) {

        TreeSet<book>bookTreeSet=new TreeSet<>(new pagecomparator().reversed());

        bookTreeSet.add(new book("volkan",145,"tümay",2014));
        bookTreeSet.add(new book("marin",435,"berkan",1905));
        bookTreeSet.add(new book("ülkü",34,"asým",2000));

        for (book i:bookTreeSet) {
            System.out.println(i.getPagenumber());
        }

        System.out.println("**********");

        TreeSet<book>bookTreeSet2=new TreeSet<>(new writerComparator());

        bookTreeSet2.add(new book("volkan",145,"tümay",2014));
        bookTreeSet2.add(new book("marin",435,"zerkan",1905));
        bookTreeSet2.add(new book("ülkü",34,"asým",2000));

        for (book i:bookTreeSet2) {
            System.out.println(i.getWriterName());
        }
    }
}
