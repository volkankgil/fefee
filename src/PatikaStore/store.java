package PatikaStore;

import java.util.Scanner;

public class store {
    Scanner input = new Scanner(System.in);

    public void run() {
        int number = 5;

        while (number != 0) {
            System.out.println("Patika �r�n Y�netim Paneli !" + "\n" +
                    "1 - Notebook ��lemleri" + "\n" +
                    "2 - Cep telefonu ��lemleri" + "\n" +
                    "3 - Markalar� Listele" + "\n" +
                    "0 - ��k�� yap");
            System.out.println("Se�im Yap�n�z:");
            number = input.nextInt();

            switch (number) {
                case 1:
                    new notebook().menu();
                    break;
                case 2:
                    new telefon().menu();
                    break;
                case 3:
                    new brand().showBrands();
                    break;
                case 0:
                    System.out.println("Sistemden ��k�� yapt�n�z.");
                    break;
                default:
                    System.out.println("Hatal� se�im yapt�n�z.Tekrar deneyiniz.");
            }
        }
    }
}
