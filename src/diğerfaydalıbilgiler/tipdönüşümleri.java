package di�erfaydal�bilgiler;

public class tipd�n���mleri {
    public static void main(String[] args) {

        int a=10;

        double b=a;

        System.out.println(b);  //Widening Casting (Otomatik) denir.  k���k verileri b�y�k veri tiplerine d�n��t�rebiliyoruz.
        //byte -> short -> char -> int -> long -> float -> double     VER� KAYBI OLMUYOR

        double pi=3.14;

        System.out.println((int)pi);//Narrowing Casting (Manuel)       B�y�k veri tipini daha k���k veri tipine d�n��t�rme i�lemine denir.

        byte d=85;
        System.out.println((char)d);

        System.out.println("*************");

        int e=15;
        String str=String.valueOf(e);
        System.out.println(str);   //Int string 'e d�n���m yapm�u� olduk.

        System.out.println("*************" );

        int f=Integer.parseInt(str+e);//int veritipini String'e �evirmi� olduk.
        System.out.println(f);






    }
}
