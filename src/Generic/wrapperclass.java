package Generic;

public class wrapperclass {
    public static void main(String[] args) {

        Integer a=10;

        String str=a.toString(); // Integer s�n�f�ndan tan�mlad���m�z i�in to string metodu ile String �evirebiliyoruz. int de�i�keni olarak tan�mlasayd�k olmuyor.

        System.out.println(str);

        String b="20";

        int d=Integer.parseInt(b);

        int c=10;
        System.out.println(c+d);

        System.out.println(Integer.max(10,40));

        System.out.println("************");

        System.out.println(Integer.valueOf(b)+c);

        //GEneric yap�lar wrapper s�n�flar�n� kullanmaktad�r.

        //Char '�n wrapper s�n�f� characterd�r.
    }
}
