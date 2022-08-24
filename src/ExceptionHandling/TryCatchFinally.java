package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {

        System.out.println("Program Baþladý.");
        Scanner input=new Scanner(System.in);
        int a=0;
        int b=20;
        int c;
        int [] arr=new int[2];

        try {
            System.out.println("Bölme iþlemi.");
            System.out.println(b / a); //hata verdiði koddan sonra direk catch iþlemine geçiyor.
            System.out.println("Bölme iþlemi bitti");
            System.out.println("Deðer giriniz.");
            c=input.nextInt();
            /*arr[10]=11;*/
        }catch (ArithmeticException e){
            System.out.println("Hata Yakalandý.");
            System.out.println(e.getMessage());//hatanýn ne olduðunu veriyor.
            e.printStackTrace();//varsayýlan halini veriyor.
        }
        catch (InputMismatchException e){
            System.out.println("Yanlýþ veri girildi.");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Bu kýsým kesinlikle çalýþacak.");
        }
        /*catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }*/
        //bir metodu try-catch iþlemi içine alamayýz. metod içindeki iþlemi alabiliriz.
        System.out.println("Program bitti.");
    }
}
