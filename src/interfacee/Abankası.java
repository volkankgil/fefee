package interfacee;

public class Abankas� implements I,IDeneme {//bir s�n�fa birden fazla interface implement edebiliriz.Ayn� zamanda bir s�n�f hem
    //kal�t�m hemde interface ini bir s�n�f�n alabilir.

    private String bankaAd�;
    private String terminalID;
    private String password;


    Abankas�(String bankaAd�,String terminalID,String password){
        this.bankaAd�=bankaAd�;
        this.terminalID=terminalID;
        this.password=password;
    }
    public int userPassword;

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("Kullan�c� ip : " + ipAddress);
        System.out.println("Makine ip : " + this.HOST_IP_ADRESS);

            System.out.println(this.bankaAd� + " ba�lan�ld�");
            return true;
        }

    @Override
    public boolean payment(String userPassword, double price, String cardNumber, String expireDate, String cvc){
    return true;
    }

    public String getBankaAd�(){
        return bankaAd�;
    }

    public void setBankaAd�(String bankaAd�){
        this.bankaAd�=bankaAd�;
    }

    public String getTerminalID(){
        return terminalID;
    }

    public void setTerminalID(String terminalID){
        this.terminalID=terminalID;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password=password;
    }

}
