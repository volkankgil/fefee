package collectionandmapinterfacee;

import java.util.HashMap;

public class HashmapInterface {
    public static void main(String[] args) {

        HashMap<String ,Integer> mapp=new HashMap<>(); //s�ralama garantisi yok. bir key sadece bir value'yu tutabilir.

        mapp.put("v",25);
        mapp.put("t",10);
        mapp.put("t",100);// en son atanan de�eri verir.
        mapp.put("m",35);// eleman ekleme
        mapp.put("a",10);

        mapp.remove("v",25); // maptan veri ��kar�yor.

        System.out.println(mapp.size());

        System.out.println(mapp.containsKey("g")); // anahtar tan�m�na g�re de�er var m� diye boolean d�nd�r�yor.

        System.out.println(mapp.containsValue(30));//de�er tan�m�na g�re de�er var m� diye boolean d�nd�r�yor.

        System.out.println(mapp);

        mapp.replace("a",50);//de�erini de�i�tirdi.

        for (Integer i:mapp.values()) {     // key 'e g�re gezmek istersek values metodu yerine keyset 'i �a��raca��z.
            System.out.print(i + " ");
        };

        System.out.println(mapp.get("t")); //anahtar�na g�re de�eri getiriyor.

        mapp.clear();

        System.out.println(mapp);

        System.out.println(mapp.size());


    }
}
