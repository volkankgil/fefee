package inputoutputlecture;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serializationoutput {
    public static void main(String[] args) {

        carserialization c1 = new carserialization("Mercedes", "a180");
        try {
            FileOutputStream out = new FileOutputStream("src/inputoutputlecture/volkan.txt");
            ObjectOutputStream output = new ObjectOutputStream(out);
            output.writeObject(c1);
            output.close();
        } catch (IOException e) {

        }
    }
}
