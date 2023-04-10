package Multithread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ordermaticmain {
    public static void main(String[] args) throws Exception  {
        ordermatic o1=new ordermatic();

        List<Thread>iþlemler=new ArrayList<>();

        for(int i=0;i<50;i++) {
            Thread t1 = new Thread(o1);
            iþlemler.add(t1);
            t1.start();
            //t1.join(); //Bu metodda 2 thread ayný anda baþlýyor. ama 2 bankada bekleyen ayný sýra numaralarýný alabiliyor. buz yüzden sychronaziton metodunu kullanýyoruzç.
        }

        for(Thread a:iþlemler){
            a.join();//Bu metodda 2 thread ayný anda baþlýyor. ama 2 bankada bekleyen ayný sýra numaralarýný alabiliyor. buz yüzden sychronaziton metodunu kullanýyoruzç.
        }

        System.out.println(o1.getOrderNo());

        System.out.println("==========");

        ExecutorService pool= Executors.newFixedThreadPool(10); //bütün iþ parçaçýklarýný tek bir havuza toplamaya yarýyor.

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
