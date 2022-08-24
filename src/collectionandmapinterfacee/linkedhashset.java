package collectionandmapinterfacee;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashset {
    public static void main(String[] args) {


        LinkedHashSet<Integer> lset = new LinkedHashSet<>();

        lset.add(10);
        lset.add(20);
        lset.add(10);
        lset.add(40);

        Iterator itr = lset.iterator();
        {
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
    }
}
