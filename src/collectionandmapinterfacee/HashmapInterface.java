package collectionandmapinterfacee;

import java.util.HashMap;

public class HashmapInterface {
    public static void main(String[] args) {

        HashMap<String ,Integer> mapp=new HashMap<>(); //sýralama garantisi yok. bir key sadece bir value'yu tutabilir.

        mapp.put("v",25);
        mapp.put("t",10);
        mapp.put("t",100);// en son atanan deðeri verir.
        mapp.put("m",35);// eleman ekleme
        mapp.put("a",10);

        mapp.remove("v",25); // maptan veri çýkarýyor.

        System.out.println(mapp.size());

        System.out.println(mapp.containsKey("g")); // anahtar tanýmýna göre deðer var mý diye boolean döndürüyor.

        System.out.println(mapp.containsValue(30));//deðer tanýmýna göre deðer var mý diye boolean döndürüyor.

        System.out.println(mapp);

        mapp.replace("a",50);//deðerini deðiþtirdi.

        for (Integer i:mapp.values()) {     // key 'e göre gezmek istersek values metodu yerine keyset 'i çaðýracaðýz.
            System.out.print(i + " ");
        };

        System.out.println(mapp.get("t")); //anahtarýna göre deðeri getiriyor.

        mapp.clear();

        System.out.println(mapp);

        System.out.println(mapp.size());


    }
}
