package dependencycomposotion;

public class main {
    public static void main(String[] args) {

        student s1=new student("volkan.txt","kebapc�gil",124,"vevsv",85);
        s1.getAdreess();

        student s2=new student("Marin","Kebapc�gil",241,"vwkvwkv",85);
        s2.getAdreess();

        student s3=new student("T�may","Kebapc�gil",12345,"ckowv",85);
        s3.getAdreess();

        instructor teacher=new instructor("t�may","kebapc�gil","cwv");

        instructor teacher2=new instructor("cev","ve","3");//aggretation instructor s�n�f�ndan nesne �rettik course aseralizationi�ingerekli bapl� de�il.


        //COMPOS�T�ON=COURSE HAS A �NSTRUCTOR (SINIFIN B�R ��RETMEN� VARDIR)
        course lecture =new course("biology","bio123",s1,teacher);
        System.out.println(lecture.getInstructor().getName()); //s�n�f�n bir ��retmeni vard�r. course has instructorfefe
        System.out.println(lecture.getStudent().getIdno());//fefefeve

        student [] stu ={s1,s2,s3};
        int number =stu.length;
        System.out.println(lecture.calcaverage(stu)/number);

    }
}
