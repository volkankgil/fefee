package Multithread;

public class mainthreadstop {
    public static void main(String[] args) {

        Thread t1=new Thread(new threadstop("c1",1));
        t1.start();

        Thread t2=new Thread(new threadstop("c2",2));
        t2.start();

    }
}
