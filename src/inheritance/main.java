package inheritance;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        cal�san c1 = new cal�san("volkan", "3144", "volkankgil@gmail.com");
        c1.giris();

        //akademisyen a1=new akademisyen("t�may","41445","tumaykgil@gmail.com","rehberlik","doc");
        // System.out.println(a1.derseGir("doc"));
        //a1.giris(); akademisyen s�n�f�n� abstract yapt���m�z i�in nesne �retemiyoruz. abstract yap�lan bir s�n�f�n metodunun s�n�f� daabstract olmal�d�r.

        System.out.println("*****************");

        ogretimgorevlisi o1=new ogretimgorevlisi("marin","212","marin@","mat","prof",123);
        o1.giris();
        o1.giris("11:00");//methodlarda overloading
        o1.giris("12:00","15:00");//methodlarda overloading
        System.out.println(o1.getKapino());
        o1.giris();
        System.out.println(o1.derseGir("prof volkan"));

        System.out.println("************");

        labasistan� l1=new labasistan�("berkan","2","berkankgil","fizik","doc",1800);
        l1.lablaraGir();

        bilgii�lem b1=new bilgii�lem("fef","vev","veve","v",214,"32");
        System.out.println(b1.networkKurulum("5" + " network kurulumu tamamland�."));

        g�venlikg�revlisi g1=new g�venlikg�revlisi("Berkan","124","vet","ter",352,"14");
        System.out.println(g1.getEposta());
        g1.n�bet("a5");

        // polymorphsim =bir s�n�ftan �retilen nesnenin sadece override edilen metodalar�na eri�ilebilir.

        cal�san a2=new memur("fe","ev","e33","9g",2223);
        a2.giris();


        //int [] loginUser=new int[4]; Burda array'in  di�er tan�mlanma metodunu tekrar ettim.
        cal�san [] loginUser={a2,b1,l1,o1};
        cal�san.girisYapanlar(loginUser);

        System.out.println("**************");
        c1.setEposta();
        c1.getEposta();
        c1.setTelefon("fevev");
        System.out.println(c1.getTelefon());
    }
}
