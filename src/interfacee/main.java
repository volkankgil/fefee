package interfacee;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Tutar Giriniz:");
        double price = input.nextDouble();

        System.out.println("Kart No giriniz:");
        String cardNumber = input.next();

        System.out.println("Kart Son kullanma tarihi:");
        String expireDate = input.next();

        System.out.println("Kart Cvc Number");
        String cvc = input.next();

        System.out.println("Kullan�c� �ifresi giriniz.");
        String userPassword = input.next();

        System.out.println("Banka Se�iniz:");

        System.out.println("1. A Bankas�na giri�.");
        System.out.println("2. B Bankas�na giri�.");
        System.out.println("3. C Bankas�na giri�.");

        System.out.println("Banka Se�iniz:");
        int selectbank = input.nextInt();

        int rightCount = 0;

        while (rightCount != 3) {
            switch (selectbank) {

                case 1:
                    Abankas� a1 = new Abankas�("A bankas�", "1244", "9876");

                    a1.payment(userPassword, price, cardNumber, expireDate, cvc);
                    if (a1.getPassword().equals(userPassword)) {
                        a1.connect("127.0.0.1");
                    } else {
                        System.out.println("Tekrar deneyiniz.");
                        rightCount++;
                        System.out.println("Kullan�c� �ifresi giriniz.");
                        String repeat = input.next();
                        if (a1.getPassword().equals(repeat)) {
                            a1.connect("1247.14.7");
                            rightCount=3;
                        }
                    }
                    break;

                case 2:
                    Bbankas� b1 = new Bbankas�("B bankas�", "3215", "rt23");

                    if (b1.getPassword().equals(userPassword)) {
                        b1.connect("1247.14.7");
                    } else {
                        System.out.println("Tekrar Deneyiniz.");
                        rightCount++;
                        System.out.println("Kullan�c� �ifresi giriniz.");
                        String repeat = input.next();
                        if (b1.getPassword().equals(repeat)) {
                            b1.connect("1247.14.7");
                            rightCount=3;
                        }
                    }
                    b1.payment("veev", 214, "2r1", "2r1r", "f33");
                    break;

                    case 3:
                        System.out.println("3 Numaral� banka batt�.");
                        rightCount = 3;
                        break;
                default:
                    System.out.println("Ge�erli banka giriniz.");
                    rightCount = 3;
                }
            }
        }
    }
