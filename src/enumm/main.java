package enumm;

public class main {
    public static void main(String[] args) {

        System.out.println(gun.PAZARTES�.getDay());

        gun.SALI.setDay(9); // set day ile sal�n�n 2 olan de�erini 9 yapt�k.
        System.out.println(gun.SALI.getDay());

        System.out.println("----------");

        System.out.println(day.PAZAR.getDayy()); // enum s�n�f�ndan i�lem yapt�k.

        day.CARSAMBA.takeday();
        day.PERSEMBE.takeday(); // SWT�VH TE CASE 4 � tan�mlamad���m�zdan null d�nd�.
        day.PAZARTES�.takeday();

    }
}
