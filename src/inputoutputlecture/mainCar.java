package inputoutputlecture;

import java.io.*;
//Nesneleri dosyaya yazma ve dosyadan �ekme dersi

public class mainCar {
    public static void main(String[] args) throws IOException {

        carserialization c1=new carserialization("Audi","a3");

        FileOutputStream outputFile=new FileOutputStream("src/inputoutputlecture/araba.txt");

        ObjectOutputStream output=new ObjectOutputStream(outputFile);
        output.writeObject(c1);
        output.close();

        FileInputStream inputFile=new FileInputStream("src/inputoutputlecture/araba.txt");
        ObjectInputStream input=new ObjectInputStream(inputFile);

        try {


        carserialization newCar=(carserialization) input.readObject(); //object alarak �ekmek i�in carserialization 'a tip d�n���m� yap�yoruz.
        System.out.println(newCar.getBrand());
        System.out.println(newCar.getModel());

        inputFile.close();
        input.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
