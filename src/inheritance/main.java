package inheritance;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        calýsan c1 = new calýsan("volkan", "3144", "volkankgil@gmail.com");
        c1.giris();

        //akademisyen a1=new akademisyen("tümay","41445","tumaykgil@gmail.com","rehberlik","doc");
        // System.out.println(a1.derseGir("doc"));
        //a1.giris(); akademisyen sýnýfýný abstract yaptýðýmýz için nesne üretemiyoruz. abstract yapýlan bir sýnýfýn metodunun sýnýfý daabstract olmalýdýr.

        System.out.println("*****************");

        ogretimgorevlisi o1=new ogretimgorevlisi("marin","212","marin@","mat","prof",123);
        o1.giris();
        o1.giris("11:00");//methodlarda overloading
        o1.giris("12:00","15:00");//methodlarda overloading
        System.out.println(o1.getKapino());
        o1.giris();
        System.out.println(o1.derseGir("prof volkan"));

        System.out.println("************");

        labasistaný l1=new labasistaný("berkan","2","berkankgil","fizik","doc",1800);
        l1.lablaraGir();

        bilgiiþlem b1=new bilgiiþlem("fef","vev","veve","v",214,"32");
        System.out.println(b1.networkKurulum("5" + " network kurulumu tamamlandý."));

        güvenlikgörevlisi g1=new güvenlikgörevlisi("Berkan","124","vet","ter",352,"14");
        System.out.println(g1.getEposta());
        g1.nöbet("a5");

        // polymorphsim =bir sýnýftan üretilen nesnenin sadece override edilen metodalarýna eriþilebilir.

        calýsan a2=new memur("fe","ev","e33","9g",2223);
        a2.giris();


        //int [] loginUser=new int[4]; Burda array'in  diðer tanýmlanma metodunu tekrar ettim.
        calýsan [] loginUser={a2,b1,l1,o1};
        calýsan.girisYapanlar(loginUser);

        System.out.println("**************");
        c1.setEposta();
        c1.getEposta();
        c1.setTelefon("fevev");
        System.out.println(c1.getTelefon());
    }
}
