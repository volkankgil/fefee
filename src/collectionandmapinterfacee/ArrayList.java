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
        liste.remove(1);

        Iterator <Integer> itr=liste.iterator();

            while(itr.hasNext()){
                System.out.println(itr.next());
        }

        System.out.println(liste.size());
        System.out.println(liste.get(2));
        try {
            System.out.println(liste.get(32));
        }catch (IndexOutOfBoundsException e) {
        }

        System.out.println("---------");

        System.out.println(liste.lastIndexOf(2));
        System.out.println(liste.indexOf(2));

        /*for (Integer element:liste) {
            System.out.println(element);

        }*/

        List <String> list2=new java.util.ArrayList<>();

        List<String> list3=new java.util.ArrayList<>();

        list3.add("eskişehir");

        list2.add("İzmir");
        list2.add("antalya");
        list2.add("ayddın");

        list2.addAll(list3);

        list2.addAll(0,list2);

        System.out.println(list2);

        List<String > yeniliste=list2.subList(0,2);

        System.out.println(yeniliste);
    }
}
