package inputoutputlecture;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriter {
    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter("src/inputoutputlecture/bufferWriter.txt");

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String data2 = "Volkan Kebapcýgillllll";
            bufferedWriter.write(data2);

            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
