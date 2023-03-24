package inputoutputlecture;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class file {
    public static void main(String[] args)throws IOException {

        //b�t�n veriler bayt veya character olarak akar.fakat print stream gibi s�n�flarla yaz�ya d�n��t�r�lebilir.

        File dosya=new File("src/inputoutputlecture/Patika.txt");

        System.out.println(dosya.createNewFile());  // olmayan bir dosya yarat�yor. VAR �Se olu�turmaz.

        //dosya.delete();  //yaratt���m�z dosyay� siliyor.

        //dizin olu�turma a�a��dad�r.

        File dizin=new File("test/dev");
        //dizin.mkdir(); //dosya i�in dizin olu�turuyor.
        dizin.mkdirs();  // birden fazla dizin olu�turabiliriz.
        File marin=new File("test/dev/marin.txt");
        marin.createNewFile();

        File numberOfDizin=new File("test"); // i� i�e ge�mi� dosya isimlerini ekrana bast�r�yor.

        String []liste=numberOfDizin.list();

        for (String show:liste) {
            System.out.println(show);
        }


        FileInputStream input=new FileInputStream("src/inputoutputlecture/Patika.txt");

        System.out.println("Kullan�lan byte say�s�:" +input.available());

        int i =input.read();
        while (i!=-1){
            System.out.print((char)i); //byte olarak d�nmemesi i�in Char 'a �evirdik.
            i=input.read();
        }

        //input.skip("10"); Bu metodda ilk 10 karakteri atl�yoruz.

        System.out.println("Kullan�lan byte say�s�:" +input.available()); //dosyada ka� veri okunduysa onlar byte kullan�m�ndan ��kar�l�yor.

        input.close();//haf�zada yer kaplamamas� i�in close deyip kapatmal�y�z.

        String yazi="OutputStream ��reniyorum.\nPatika Dev";

        FileOutputStream output=new FileOutputStream("src/inputoutputlecture/Patika.txt",true);// patika.txt gibi bir dosya yok ise bizim i�in olu�turuyor.
        //yan�na true de�eri vermez isek dosya i�indekileri siliyor.true verir isek verdi�imiz verileri dosyada mevcut olanlar�n �st�ne ekliyor.
        byte[] yaz�Byte = yazi.getBytes();
        output.write(yaz�Byte);
        output.close();
    }
}
