package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {

        System.out.println("Program Ba�lad�.");
        Scanner input=new Scanner(System.in);
        int a=0;
        int b=20;
        int c;
        int [] arr=new int[2];

        try {
            System.out.println("B�lme i�lemi.");
            System.out.println(b / a); //hata verdi�i koddan sonra direk catch i�lemine ge�iyor.
            System.out.println("B�lme i�lemi bitti");
            System.out.println("De�er giriniz.");
            c=input.nextInt();
            /*arr[10]=11;*/
        }catch (ArithmeticException e){
            System.out.println("Hata Yakaland�.");
            System.out.println(e.getMessage());//hatan�n ne oldu�unu veriyor.
            e.printStackTrace();//varsay�lan halini veriyor.
        }
        catch (InputMismatchException e){
            System.out.println("Yanl�� veri girildi.");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Bu k�s�m kesinlikle �al��acak.");
        }
        /*catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }*/
        //bir metodu try-catch i�lemi i�ine alamay�z. metod i�indeki i�lemi alabiliriz.
        System.out.println("Program bitti.");
    }
}
