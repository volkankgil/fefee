package collectionandmapinterfacee;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashset {
    public static void main(String[] args) {


        LinkedHashSet<Integer> lset = new LinkedHashSet<>();

        lset.add(10);
        lset.add(20);
        lset.add(10);
        lset.add(50);
        lset.add(40);

        Iterator itr = lset.iterator();

            while (itr.hasNext()) {
                System.out.println(itr.next());//ayn� olan de�erleri ekrana bast�rm�yor. s�ralama de��mez.
            }
        System.out.println(lset.size());
    }
}
