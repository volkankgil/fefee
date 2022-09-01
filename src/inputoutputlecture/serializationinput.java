package inputoutputlecture;

import java.io.FileInputStream;

import java.io.ObjectInputStream;

public class serializationinput {
    public static void main(String[] args) {


        try {
        FileInputStream inputfile = new FileInputStream("src/inputoutputlecture/volkan.txt");

        ObjectInputStream inputStream = new ObjectInputStream(inputfile);

            car newcar = (car) inputStream.readObject();
            System.out.println(newcar.getBrand());
            System.out.println(newcar.getModel());
            inputfile.close();
            inputStream.close();

        } catch (Exception e) {
        }
    }
}