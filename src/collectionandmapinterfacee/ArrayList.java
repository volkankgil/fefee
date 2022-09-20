package collectionandmapinterfacee;

import java.util.Iterator;
import java.util.List;
import java.util.SplittableRandom;

public class ArrayList {
    public static void main(String[] args) {

        List <Integer> liste=new java.util.ArrayList<>();

        liste.add(10);
        liste.add(15);
        liste.add(2);
        liste.add(null);
        liste.add(23);
        liste.add(10);
        liste.add(2);
        liste.add(2);

        liste.set(1,null);

        liste.add(0,33);
        liste.remove(6);

        Iterator <Integer> itr=liste.iterator();

            while(itr.hasNext()){
                System.out.println(itr.next());
        }

        System.out.println("--------");

        System.out.println(liste.size());
        System.out.println(liste.get(2));
        try {
            System.out.println(liste.get(32));
        }catch (IndexOutOfBoundsException e) {
        }

       /* for(Integer a:liste){      // for döngüsü ilede elemanlarý yazdýrabiliriz.
            System.out.println(a);
        }*/

        System.out.println("---------");

        System.out.println(liste.lastIndexOf(2));
        System.out.println(liste.indexOf(2)); // ilk 2 verisi olan index sayýsýný verir.

        /*for (Integer element:liste) {
            System.out.println(element);

        }*/

        List<String> list2=new java.util.ArrayList<>();

        List<String> list3=new java.util.ArrayList<>();

        list3.add("eskiþehir");

        list2.add("Ýzmir");
        list2.add("antalya");
        list2.add("ayddýn");

        list2.addAll(list3);

        list2.addAll(0,list2); //hangi index'i verir isek oradan baþlýyor.

        System.out.println(list2);

        List<String > yeniliste=list2.subList(0,3); //ilk index'i dahil ediyor. son index'i almýyor.

        System.out.println(yeniliste);
    }
}
