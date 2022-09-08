package Multithread;

public class main {
    public static void main(String[] args) {

        counter c1=new counter("Counter 1");
        counter c2=new counter("Counter 2");

        //c1.start(); // start der isek 2 iþlem parçaçaýðý ayný anda kafasýna göre çalýþýyor.
        //c2.start();

        c1.run(); // sýra ile çalýþýyor iþ parçaçýklarý run metodunu çaðýrdýðýmýzda
        c2.run();

        // birden fazla sýnýf kalýtým yapmak lazým ise runnable sýnýfýný implement edebiliriz.
    }
}
