package inputoutputlecture;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class file {
    public static void main(String[] args)throws IOException {

        File dosya=new File("src/inputoutputlecture/Patika.txt");


        dosya.createNewFile();  // dosya yaratıyor.

        //dosya.delete();  yarattığımız dosyayı siliyor.

        FileOutputStream input =new FileOutputStream("aseralizationiçingerekli",true); // yanına true değeri vermezisek içindekileri siliyor.

    }
}
