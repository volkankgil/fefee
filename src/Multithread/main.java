package Multithread;

public class main {
    public static void main(String[] args) {

        counter c1=new counter("Counter 1");
        counter c2=new counter("Counter 2");

        //c1.start(); // start der isek 2 i�lem par�a�a��� ayn� anda kafas�na g�re �al���yor.
        //c2.start();

        c1.run(); // s�ra ile �al���yor i� par�a��klar� run metodunu �a��rd���m�zda
        c2.run();

        // birden fazla s�n�f kal�t�m yapmak laz�m ise runnable s�n�f�n� implement edebiliriz.
    }
}
