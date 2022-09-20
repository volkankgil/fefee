package collectionandmapinterfacee;


import java.util.Iterator;

public class LinkedHashMap {
    public static void main(String[] args) {

        java.util.LinkedHashMap<String,Integer>linl=new java.util.LinkedHashMap<>();  // aynı sırada çıkma garantisi veriyor.

        linl.put("a",10);
        linl.put("b",24);
        linl.put("c",5);
        linl.put("d",30);
        linl.put("e",24);

        for(Integer i:linl.values()){
            System.out.println(i + " ");
        }



    }
}
