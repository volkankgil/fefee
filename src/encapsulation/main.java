package encapsulation;

public class main {
    public static void main(String[] args) {

        dataclass car=new dataclass("Audi","a3",-432);

        // car.price=-5000; Sýnýfda deðiþkeni private yaparak baþka bir sýnýftan eriþimini kapattým.

        car.printPrice();

        dataclass car2=new dataclass("bmw","b3",20000);

        car2.changePrice(-234);
        car2.printPrice();

        car2.getName();
        car2.setCarName("marin");
        car2.getName();
       // System.out.println(car2.carName); carName private olduðu için ekrana bastýramýyoruz. yazdýðýmýz metoddan bastýrmalýyýz.


    }
}
