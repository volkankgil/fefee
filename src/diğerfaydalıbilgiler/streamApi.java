package di�erfaydal�bilgiler;

import java.util.*;

public class streamApi {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(144);
        list.add(25);
        list.add(25);
        list.add(34);
        list.add(50);
        list.add(10);
        list.add(76);
        list.add(100);
        list.add(100);
        list.add(50);
        list.add(105);

        list.stream().forEach(printList -> System.out.println(printList));

        System.out.println("-------");

        list.stream().filter(number -> number < 60).forEach(printList -> System.out.println(printList)); // filtre koymam�za yar�yor.

        System.out.println("-------");

        list.stream().distinct().forEach(integer -> System.out.println(integer)); //ayn� de�erleri sadece bir kere bast�r�yor.

        System.out.println("------");

        list.stream().distinct().sorted(Comparator.reverseOrder()).forEach(integer -> System.out.println(integer)); //liste elemanlar� aras�nda s�ralama yap�yor.

        System.out.println("-------");

        list.stream().limit(5).forEach(integer -> System.out.println(integer)); //ilk 5 eleman�n� al�yor.

        System.out.println("-------");

        list.stream().skip(2).limit(6).forEach(integer -> System.out.println(integer));//ilk 2 eleamn� atlay�p, geri kalan�n� yazd�r�yor.

        System.out.println("-------");

        long c = list.stream().count();
        System.out.println(c);

        System.out.println("-------");

        boolean control = list.stream().anyMatch(integer -> integer == 25); // array liste bu lambda ifadesinin olup olmad���n� bak�yor.
        System.out.println(control);

        System.out.println("--------");

        boolean control2 = list.stream().noneMatch(integer -> integer == 25); // array liste bu lambda ifadesinin olup olmad���n� bak�yor.
        System.out.println(control2);

        System.out.println("------");

        list.stream().map(integer -> Math.sqrt(integer)).forEach(aDouble -> System.out.println(aDouble));

        System.out.println("--------");

        list.stream().filter(a->a>100).forEach(i-> System.out.println(i));
    }
}
