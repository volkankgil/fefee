package inputoutputlecture;

import java.io.BufferedReader;
import java.io.FileReader;

public class bufferReader {
    public static void main(String[] args) {

        try {

            FileReader fileReader = new FileReader("src/inputoutputlecture/Patika.txt");

            BufferedReader b1 = new BufferedReader(fileReader);

            String line = b1.readLine();

            /*while ((line = b1.readLine()) != null) {
                System.out.println(line);
            }*/

            while (line != null) {
                System.out.println(line + "****");
                line = b1.readLine();  //sat�r sat�r s�ra ile okudu�u i�in line=b1.readlin(); yap�yoruz.
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
