package collectionandmapinterfacee;

import java.util.*;

public class QueueLinkedlist {
    public static void main(String[] args) {

        Queue<Integer> queue=new LinkedList<>();

        queue.add(10);
        queue.add(15);
        queue.add(20);

        //queue.remove(20);  Linkedlistler index olarak de�il adres olarak verileri tuttu�undan indis say�s� de�il obje girmeliyiz. Bir�y girmezsek ilk eleman� siler.

        queue.offer(43); // kuyru�un sonuna eleman ekliyor.

        System.out.println(queue.element());//kuyru�un ba��ndaki eleman� veriyor. kuyruktan atmaz.

        System.out.println(queue.poll()); //kuyru�un ba��ndaki eleman� veriyor. kuyruktan atar.

        System.out.println("------------");

        Iterator<Integer> �tr=queue.iterator();

        while (�tr.hasNext()){
            System.out.println(�tr.next());
        }

        System.out.println("---------");

        PriorityQueue<Integer> �nt=new PriorityQueue<>(new Comparator<Integer>() { //new comparator s�n�f�ndan compare metodunu �a��drd�k.
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        �nt.add(30);
        �nt.add(20);
        �nt.add(40);

        Iterator<Integer>itr=�nt.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
