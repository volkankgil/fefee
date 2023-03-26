package ExceptionHandling;

import java.util.*;

public class throww {

    public static void check(int age) throws Exception { //throws Exception deyip metoddan hatay� f�rlat�yoruz.
        if(age<18){
            throw new Exception ("Ya��n�z tutmuyor."); // new exception diyerek exception s�n�f�ndan yeni bir nesne �retmi� oluyoruz.
        }
    }
    public static void main(String[] args)throws Exception  {

        Scanner input=new Scanner(System.in);

        System.out.println("Bir Say� Giriniz.");
        int age=input.nextInt();

        try {
            check(age);
        }
        catch (Exception e){
            System.out.println("Ya�� Uymad�.");
            System.out.println(e.getMessage());//Ya��n�z tutmuyor. ekrana bast�r�yor
        }
    }
}
