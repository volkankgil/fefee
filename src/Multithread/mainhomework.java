package Multithread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class mainhomework {
    public static void main(String[] args) {

        Homework h1=new Homework();

        Thread t1=new Thread(h1);
        t1.start();

        System.out.println("-------------");

        ExecutorService exe= Executors.newFixedThreadPool(5);

        for(int i=1;i<=10000;i++){
            exe.execute(h1);
        }
        exe.shutdown();  //i� par�a����n�n durmas� i�in yaz�yoruz.
        try {
            exe.awaitTermination(1,TimeUnit.SECONDS);// BU METODDAN SONRA PROGRAMIN NE KADAR �ALI�ACA�INI BEL�RLEYEB�L�YORUZ.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Even Numbers : " +h1.getTeksay�lar().size());

    }
}
