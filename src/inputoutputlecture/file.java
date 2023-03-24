package inputoutputlecture;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class file {
    public static void main(String[] args)throws IOException {

        //bütün veriler bayt veya character olarak akar.fakat print stream gibi sýnýflarla yazýya dönüþtürülebilir.

        File dosya=new File("src/inputoutputlecture/Patika.txt");

        System.out.println(dosya.createNewFile());  // olmayan bir dosya yaratýyor. VAR ÝSe oluþturmaz.

        //dosya.delete();  //yarattýðýmýz dosyayý siliyor.

        //dizin oluþturma aþaðýdadýr.

        File dizin=new File("test/dev");
        //dizin.mkdir(); //dosya için dizin oluþturuyor.
        dizin.mkdirs();  // birden fazla dizin oluþturabiliriz.
        File marin=new File("test/dev/marin.txt");
        marin.createNewFile();

        File numberOfDizin=new File("test"); // iç içe geçmiþ dosya isimlerini ekrana bastýrýyor.

        String []liste=numberOfDizin.list();

        for (String show:liste) {
            System.out.println(show);
        }


        FileInputStream input=new FileInputStream("src/inputoutputlecture/Patika.txt");

        System.out.println("Kullanýlan byte sayýsý:" +input.available());

        int i =input.read();
        while (i!=-1){
            System.out.print((char)i); //byte olarak dönmemesi için Char 'a çevirdik.
            i=input.read();
        }

        //input.skip("10"); Bu metodda ilk 10 karakteri atlýyoruz.

        System.out.println("Kullanýlan byte sayýsý:" +input.available()); //dosyada kaç veri okunduysa onlar byte kullanýmýndan çýkarýlýyor.

        input.close();//hafýzada yer kaplamamasý için close deyip kapatmalýyýz.

        String yazi="OutputStream öðreniyorum.\nPatika Dev";

        FileOutputStream output=new FileOutputStream("src/inputoutputlecture/Patika.txt",true);// patika.txt gibi bir dosya yok ise bizim için oluþturuyor.
        //yanýna true deðeri vermez isek dosya içindekileri siliyor.true verir isek verdiðimiz verileri dosyada mevcut olanlarýn üstüne ekliyor.
        byte[] yazýByte = yazi.getBytes();
        output.write(yazýByte);
        output.close();
    }
}
