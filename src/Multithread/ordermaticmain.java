package Multithread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ordermaticmain {
    public static void main(String[] args) throws Exception  {
        ordermatic o1=new ordermatic();

        ordermatic o2=new ordermatic();
        List<Thread>i�lemler=new ArrayList<>();

        Thread t1=new Thread(o1);
        t1.start();
        t1.join();

        Thread t2=new Thread(o1);
        t2.start();
        t2.join();

        System.out.println("==========");

        ExecutorService pool= Executors.newFixedThreadPool(10); //b�t�n i� par�a��klar�n� tek bir havuza toplamaya yar�yor.

        for(int i=0;i<100;i++){
            Thread t3=new Thread(o2);
            pool.execute(o1);
           // i�lemler.add(t3);
            t3.start();
        }

        /*private synchronized void increment() {

            this.orderNo = this.orderNo + 1;

            StringBuilder builder = new StringBuilder();
            builder.append(Thread.currentThread().getName());
            builder.append(" thread got ");
            builder.append(this.orderNo);
            builder.append(" from Qmatic!");

            System.out.println(builder.toString());
        }*/
    }
}
