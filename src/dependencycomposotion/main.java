package dependencycomposotion;

public class main {
    public static void main(String[] args) {

        student s1=new student("volkan.txt","kebapcýgil",124,"vevsv",85);
        s1.getAdreess();

        student s2=new student("Marin","Kebapcýgil",241,"vwkvwkv",85);
        s2.getAdreess();

        student s3=new student("Tümay","Kebapcýgil",12345,"ckowv",85);
        s3.getAdreess();

        instructor teacher=new instructor("tümay","kebapcýgil","cwv");

        instructor teacher2=new instructor("cev","ve","3");//aggretation instructor sýnýfýndan nesne ürettik course aseralizationiçingerekli baplý deðil.


        //COMPOSÝTÝON=COURSE HAS A ÝNSTRUCTOR (SINIFIN BÝR ÖÐRETMENÝ VARDIR)
        course lecture =new course("biology","bio123",s1,teacher);
        System.out.println(lecture.getInstructor().getName()); //sýnýfýn bir öðretmeni vardýr. course has instructorfefe
        System.out.println(lecture.getStudent().getIdno());//fefefeve

        student [] stu ={s1,s2,s3};
        int number =stu.length;
        System.out.println(lecture.calcaverage(stu)/number);

    }
}
