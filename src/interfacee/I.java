package interfacee;

public interface I {

    final String HOST_IP_ADRESS="130.0.0.5";

    public boolean connect(String ipAddress);

    public boolean payment(String userPassword, double price, String cardNumber, String expireDate, String cvc);
    //ublic boolean payment(String userPassword, double price, Strin
    /*{
         -abstract sýnýflarda olduðu gibi interface'lerde de metod'un süslü parantezinin içi boþtur.
         -abstract sýnýflarda deðiþken tanýmlayabiliriz. interface'lerde tanýmlayamayýz.sadece construct sýnýfý olmadýðý için deðeri olan
         deðiþþkenler atayabiliriz özellikle final olanlardýr. final int AA=1214;fefewwvqv
    }*/
}
