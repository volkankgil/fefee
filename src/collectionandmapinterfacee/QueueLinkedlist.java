package collectionandmapinterfacee;

import java.util.*;

public class QueueLinkedlist {
    public static void main(String[] args) {

        Queue<Integer> queue=new LinkedList<>();

        queue.add(10);
        queue.add(15);
        queue.add(20);

        //queue.remove(20);  Linkedlistler index olarak deðil adres olarak verileri tuttuðundan indis sayýsý deðil obje girmeliyiz. Birþy girmezsek ilk elemaný siler.

        queue.offer(43); // kuyruðun sonuna eleman ekliyor.

        System.out.println(queue.element());//kuyruðun baþýndaki elemaný veriyor. kuyruktan atmaz.

        System.out.println(queue.poll()); //kuyruðun baþýndaki elemaný veriyor. kuyruktan atar.

        System.out.println("------------");

        Iterator<Integer> ýtr=queue.iterator();

        while (ýtr.hasNext()){
            System.out.println(ýtr.next());
        }

        System.out.println("---------");

        PriorityQueue<Integer> ýnt=new PriorityQueue<>(new Comparator<Integer>() { //new comparator sýnýfýndan compare metodunu çaðýdrdýk.
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        ýnt.add(30);
        ýnt.add(20);
        ýnt.add(40);

        Iterator<Integer>itr=ýnt.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
