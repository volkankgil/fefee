package Multithread;

public class ordermatic implements Runnable {

    private final Object LOCK=new Object(); //scyhronized metodunun i�ine yazmak i�in biz Lock nesnesi ool�utruduk.

    private int orderNo;

    public ordermatic(){
        this.orderNo=0;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000); // program 2 i�lem aras�nda �al��mak i�in bu kadar bekliyor.
        } catch (Exception e) {
            e.getMessage();
        }

        synchronized (LOCK) {
            this.orderNo++;
                System.out.println(Thread.currentThread().getName() + " - OrderNo :" + orderNo); // o an �al��an threadin ismini Thread.currentThread().getName() bu �ekilde al�yoruz.
            }
        }

    public int getOrderNo(){
        return this.orderNo;
    }

    public void setOrderNo(int orderNo){
        this.orderNo=orderNo;
    }
}

