package staticmethod;

public class main {
    public static void main(String[] args) {



        System.out.println(player.remainingtime);// veri tipini static yazd���m�zda direk s�n�f �zerinden �a��rabiliriz. nesne �retmeye gerek yok.

        player p1=new player("volkan",35);

        System.out.println(p1.getName());

        player p2=new player("t�may",21);

        System.out.println(p2.getScore());

        System.out.println(player.remainingtime);// constroctur'da art�rma verdi�imiz i�in 17 oluyor.

        System.out.println(player.remainingtime=25);

        player p3=new player("marin",45);

        System.out.println(player.remainingtime);

        System.out.println(player.injury()); // player s�n�f�nda yazd���m�z static bir metodu burada �a��rabiliriz.

    }
}
