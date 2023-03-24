package ExceptionHandling;

import java.util.*;

public class throww {

    public static void check(int age) throws Exception { //throws Exception deyip metoddan hatayý fýrlatýyoruz.
        if(age<18){
            throw new Exception ("Yaþýnýz tutmuyor."); // new exception diyerek exception sýnýfýndan yeni bir nesne üretmiþ oluyoruz.
        }
    }
    public static void main(String[] args)throws Exception  {

        Scanner input=new Scanner(System.in);

        System.out.println("Bir Sayý Giriniz.");
        int age=input.nextInt();

        try {
            check(age);
        }
        catch (Exception e){
            System.out.println("Yaþý Uymadý.");
            System.out.println(e.getMessage());//Yaþýnýz tutmuyor. ekrana bastýrýyor
        }
    }
}
