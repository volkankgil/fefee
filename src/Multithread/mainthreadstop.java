package Multithread;

public class mainthreadstop {
    public static void main(String[] args) {

        threadstop s=new threadstop("c1",1);
        Thread t1=new Thread(s);
        t1.start();

        try {
            Thread.sleep(4000); //program ba�lad�ktan 4 sn sonra bu metodla duruyor.
        }catch (Exception e){
            e.getMessage();
        }
        s.threadstop(); //threadstop s�n�f�nda yazd���m�z stop metodunu �a��rd�k.Thread s�n�f�n�n stop fonksiyonu yok.

        // Thread t2=new Thread(new threadstop("c2",2));
        // t2.start();
    }
}
