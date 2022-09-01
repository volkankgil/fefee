package inputoutputlecture;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class file {
    public static void main(String[] args)throws IOException {

        File dosya=new File("src/inputoutputlecture/Patika.txt");


        dosya.createNewFile();  // dosya yaratýyor.

        //dosya.delete();  yarattýðýmýz dosyayý siliyor.

        FileOutputStream input =new FileOutputStream("aseralizationiçingerekli",true); // yanýna true deðeri vermezisek içindekileri siliyor.



    }
}
