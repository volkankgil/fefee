package Multithread;

public class mainthreadstop {
    public static void main(String[] args) {

        threadstop s=new threadstop("c1",1);
        Thread t1=new Thread(s);
        t1.start();

        try {
            Thread.sleep(4000); //program baþladýktan 4 sn sonra bu metodla duruyor.
        }catch (Exception e){
            e.getMessage();
        }
        s.threadstop(); //threadstop sýnýfýnda yazdýðýmýz stop metodunu çaðýrdýk.Thread sýnýfýnýn stop fonksiyonu yok.

        // Thread t2=new Thread(new threadstop("c2",2));
        // t2.start();
    }
}
