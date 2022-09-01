package treeset;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class main2 {
    public static void main(String[] args) {

        //LinkedHashMap<Integer, student> lhm = new LinkedHashMap<>();

        TreeMap<Integer,student> lhm=new TreeMap<>(new orderbynotecomparator());// tree map constructor metodu içine orderby nesnesi oluþturduk.

        lhm.put(5, new student("volkan.txt", 38));
        lhm.put(2, new student("marin", 10));
        lhm.put(3, new student("tümay", 25));

        for (student i : lhm.values()) {
            System.out.println(i.getStudentNote());
        }
    }
}
