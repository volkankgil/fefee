package treeset;

import java.util.TreeSet;

public class main {
    public static void main(String[] args) {

        TreeSet<student> students = new TreeSet<>(new OrderNoteComparator().reversed()); // büyükten küçüğe sıralamak için reversed yaptık.küçükten büyüğe yapmak için reverse kaldırabiliriz.
        TreeSet<student> studentss = new TreeSet<>(new OrderNameComparator());
   /* student s1=new student("Berkan",100);
    students.add(s1);  aşağıda yaptığımız gibi new diyerek ekstra "student s1" yazıp nesne yazmayabiliriz.*/


        students.add(new student("Volkan", 35));
        students.add(new student("Tümay", 50));
        students.add(new student("Marin", 98));
        students.add(new student("Ülkü", 76));

        studentss.add(new student("zehra",42));
        studentss.add(new student("asım",24));

        for(student stu:students){
            System.out.println(stu.getStudentName());
        }

        System.out.println("*********");

        for(student stuu :studentss){
            System.out.println(stuu.getStudentName());

        }
    }
}
