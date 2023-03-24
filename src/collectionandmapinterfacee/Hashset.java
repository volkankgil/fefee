package collectionandmapinterfacee;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {

        HashSet<Integer> hash=new HashSet<>(); // genericmethod olarak hash ad� alt�nda nesne �rettik.

        hash.add(10);
        hash.add(30); // hashset'ler veriyi yazd���m�z s�rada tutmayabilirler.
        hash.add(20);
        hash.add(20);
        hash.add(null);

        System.out.println(hash.isEmpty()); // hash set dolu bo� mu oldu�unu boolean veriyor.
        System.out.println(hash.size()); // hash set boyutunu veriyor.
        System.out.println(hash.contains(null)); // hashsette null var m� yok mu bak�yor.
        hash.remove(10); // 10 de�eri hashset i�inden kald�r�ld�.
        /*hash.clear(); // hashset'teki verilerin hepsini siliyor.*/

        System.out.println("*************");

        for (Integer a:hash) {          //ayn� tekrarlayan de�erleri vermiyor. ekrana bast�rm�yor.
            System.out.println(a);
        }

        System.out.println("***********");

        Iterator<Integer> �tr=hash.iterator();
        while (�tr.hasNext()){
            System.out.println(�tr.next());
        }
    }
}
