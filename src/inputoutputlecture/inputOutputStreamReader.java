package inputoutputlecture;

import java.io.*;
import java.nio.charset.Charset;

public class inputOutputStreamReader {
    public static void main(String[] args) throws IOException {

        // karakter giri�i vve ��k���

        FileInputStream input=new FileInputStream("src/inputoutputlecture/Patika.txt");

        InputStreamReader strReader=new InputStreamReader(input);
        strReader.getEncoding();

        int i=strReader.read();

        while (i!=-1){
            System.out.print((char)i);
            i=strReader.read();
        }

        String data="����";

        FileOutputStream output=new FileOutputStream("src/inputoutputlecture/streamWriterOutput.txt");
        OutputStreamWriter filewriter=new OutputStreamWriter(output,Charset.forName("Cp1254"));
        filewriter.write(data);

        //output.write(data.getBytes(Charset.defaultCharset()));  // yazman�n 2. y�ntemi
        filewriter.close();
        output.close();
    }
}
