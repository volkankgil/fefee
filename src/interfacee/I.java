package interfacee;

public interface I {

    final String HOST_IP_ADRESS="130.0.0.5";

    public boolean connect(String ipAddress);

    public boolean payment(String userPassword, double price, String cardNumber, String expireDate, String cvc);
    //ublic boolean payment(String userPassword, double price, Strin
    /*{
         -abstract s�n�flarda oldu�u gibi interface'lerde de metod'un s�sl� parantezinin i�i bo�tur.
         -abstract s�n�flarda de�i�ken tan�mlayabiliriz. interface'lerde tan�mlayamay�z.sadece construct s�n�f� olmad��� i�in de�eri olan
         de�i��kenler atayabiliriz �zellikle final olanlard�r. final int AA=1214;fefewwvqv
    }*/
}
