package encapsulation;

public class main {
    public static void main(String[] args) {

        dataclass car=new dataclass("Audi","a3",-432);

        // car.price=-5000; S�n�fda de�i�keni private yaparak ba�ka bir s�n�ftan eri�imini kapatt�m.

        car.printPrice();

        dataclass car2=new dataclass("bmw","b3",20000);

        car2.changePrice(-234);
        car2.printPrice();

        car2.getName();
        car2.setCarName("marin");
        car2.getName();
       // System.out.println(car2.carName); carName private oldu�u i�in ekrana bast�ram�yoruz. yazd���m�z metoddan bast�rmal�y�z.


    }
}
