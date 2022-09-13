package diðerfaydalýbilgiler;

public class tipdönüþümleri {
    public static void main(String[] args) {

        int a=10;

        double b=a;

        System.out.println(b);  //Widening Casting (Otomatik) denir.  küçük verileri büyük veri tiplerine dönüþtürebiliyoruz.
        //byte -> short -> char -> int -> long -> float -> double     VERÝ KAYBI OLMUYOR

        double pi=3.14;

        System.out.println((int)pi);//Narrowing Casting (Manuel)       Büyük veri tipini daha küçük veri tipine dönüþtürme iþlemine denir.

        byte d=85;
        System.out.println((char)d);

        System.out.println("*************");

        int e=15;
        String str=String.valueOf(e);
        System.out.println(str);   //Int string 'e dönüþüm yapmýuþ olduk.

        System.out.println("*************" );

        int f=Integer.parseInt(str+e);//int veritipini String'e çevirmiþ olduk.
        System.out.println(f);






    }
}
