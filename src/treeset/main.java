package treeset;

import java.util.TreeSet;

public class main {
    public static void main(String[] args) {

        TreeSet<student> students = new TreeSet<>(new OrderNoteComparator().reversed()); // b�y�kten k����e s�ralamak i�in reversed yapt�k.k���kten b�y��e yapmak i�in reverse kald�rabiliriz.
        TreeSet<student> studentss = new TreeSet<>(new OrderNameComparator());
   /* student s1=new student("Berkan",100);
    students.add(s1);  a�a��da yapt���m�z gibi new diyerek ekstra "student s1" yaz�p nesne yazmayabiliriz.*/


        students.add(new student("Volkan", 35));
        students.add(new student("T�may", 50));
        students.add(new student("Marin", 98));
        students.add(new student("�lk�", 76));

        studentss.add(new student("zehra",42));
        studentss.add(new student("as�m",24));

        for(student stu:students){
            System.out.println(stu.getStudentName());
        }

        System.out.println("*********");

        for(student stuu :studentss){
            System.out.println(stuu.getStudentName());

        }
    }
}
