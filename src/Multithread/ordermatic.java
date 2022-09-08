package Multithread;

public class ordermatic implements Runnable {

    private final Object LOCK=new Object();

    private int orderNo;

    public ordermatic(){
        this.orderNo=-1;
    }

    @Override
    public void run() {
        //for (int i = 0; i < 4; i++) {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.getMessage();
        }

        synchronized (LOCK) {
            this.orderNo++;
            System.out.println(Thread.currentThread().getName() + " - OrderNo :" + this.orderNo);
        }
    }
    public int getOrderNo(){
        return this.orderNo;
    }

    public void setOrderNo(int orderNo){
        this.orderNo=orderNo;
    }

}
