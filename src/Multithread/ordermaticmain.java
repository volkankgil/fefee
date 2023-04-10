package Multithread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ordermaticmain {
    public static void main(String[] args) throws Exception  {
        ordermatic o1=new ordermatic();

        List<Thread>i�lemler=new ArrayList<>();

        for(int i=0;i<50;i++) {
            Thread t1 = new Thread(o1);
            i�lemler.add(t1);
            t1.start();
            //t1.join(); //Bu metodda 2 thread ayn� anda ba�l�yor. ama 2 bankada bekleyen ayn� s�ra numaralar�n� alabiliyor. buz y�zden sychronaziton metodunu kullan�yoruz�.
        }

        for(Thread a:i�lemler){
            a.join();//Bu metodda 2 thread ayn� anda ba�l�yor. ama 2 bankada bekleyen ayn� s�ra numaralar�n� alabiliyor. buz y�zden sychronaziton metodunu kullan�yoruz�.
        }

        System.out.println(o1.getOrderNo());

        System.out.println("==========");

        ExecutorService pool= Executors.newFixedThreadPool(10); //b�t�n i� par�a��klar�n� tek bir havuza toplamaya yar�yor.

        for(int i=0;i<100;i++){
            pool.execute(o1);
        }


        /*private synchronized void increment() { //senkronizasyonun increment metodla olan halidir.

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
