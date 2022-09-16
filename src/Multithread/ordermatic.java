package Multithread;

public class ordermatic implements Runnable {

    private final Object LOCK=new Object(); //scyhronized metodunun içine yazmak için biz Lock nesnesi oolþutruduk.

    private int orderNo;

    public ordermatic(){
        this.orderNo=0;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000); // program 2 iþlem arasýnda çalýþmak için bu kadar bekliyor.
        } catch (Exception e) {
            e.getMessage();
        }

        synchronized (LOCK) {
            this.orderNo++;
                System.out.println(Thread.currentThread().getName() + " - OrderNo :" + orderNo); // o an çalýþan threadin ismini Thread.currentThread().getName() bu þekilde alýyoruz.
            }
        }

    public int getOrderNo(){
        return this.orderNo;
    }

    public void setOrderNo(int orderNo){
        this.orderNo=orderNo;
    }
}

