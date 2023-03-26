package enumm;

public class main {
    public static void main(String[] args) {

        System.out.println(gun.PAZARTESÝ.getDay());

        gun.SALI.setDay(9); // set day ile salýnýn 2 olan deðerini 9 yaptýk.
        System.out.println(gun.SALI.getDay());

        System.out.println("----------");

        System.out.println(day.PAZAR.getDayy()); // enum sýnýfýndan iþlem yaptýk.

        day.CARSAMBA.takeday();
        day.PERSEMBE.takeday(); // SWTÝVH TE CASE 4 ü tanýmlamadýðýmýzdan null döndü.
        day.PAZARTESÝ.takeday();

    }
}
