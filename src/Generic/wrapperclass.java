package Generic;

public class wrapperclass {
    public static void main(String[] args) {

        Integer a=10;

        String str=a.toString(); // Integer sýnýfýndan tanýmladýðýmýz için to string metodu ile String çevirebiliyoruz. int deðiþkeni olarak tanýmlasaydýk olmuyor.

        System.out.println(str);

        String b="20";

        int d=Integer.parseInt(b);

        int c=10;
        System.out.println(c+d);

        System.out.println(Integer.max(10,40));

        System.out.println("************");

        System.out.println(Integer.valueOf(b)+c);

        //GEneric yapýlar wrapper sýnýflarýný kullanmaktadýr.

        //Char 'ýn wrapper sýnýfý characterdýr.
    }
}
