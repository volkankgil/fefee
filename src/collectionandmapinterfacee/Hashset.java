package collectionandmapinterfacee;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {

        HashSet<Integer> hash=new HashSet<>(); // genericmethod olarak hash adý altýnda nesne ürettik.

        hash.add(10);
        hash.add(30); // hashset'ler veriyi yazdýðýmýz sýrada tutmayabilirler.
        hash.add(20);
        hash.add(20);
        hash.add(null);

        System.out.println(hash.isEmpty()); // hash set dolu boþ mu olduðunu boolean veriyor.
        System.out.println(hash.size()); // hash set boyutunu veriyor.
        System.out.println(hash.contains(null)); // hashsette null var mý yok mu bakýyor.
        hash.remove(10); // 10 deðeri hashset içinden kaldýrýldý.
        /*hash.clear(); // hashset'teki verilerin hepsini siliyor.*/

        System.out.println("*************");

        for (Integer a:hash) {          //ayný tekrarlayan deðerleri vermiyor. ekrana bastýrmýyor.
            System.out.println(a);
        }

        System.out.println("***********");

        Iterator<Integer> ýtr=hash.iterator();
        while (ýtr.hasNext()){
            System.out.println(ýtr.next());
        }
    }
}
