package staticmethod;

public class main {
    public static void main(String[] args) {



        System.out.println(player.remainingtime);// veri tipini static yazdýðýmýzda direk sýnýf üzerinden çaðýrabiliriz. nesne üretmeye gerek yok.

        player p1=new player("volkan",35);

        System.out.println(p1.getName());

        player p2=new player("tümay",21);

        System.out.println(p2.getScore());

        System.out.println(player.remainingtime);// constroctur'da artýrma verdiðimiz için 17 oluyor.

        System.out.println(player.remainingtime=25);

        player p3=new player("marin",45);

        System.out.println(player.remainingtime);

        System.out.println(player.injury()); // player sýnýfýnda yazdýðýmýz static bir metodu burada çaðýrabiliriz.

    }
}
