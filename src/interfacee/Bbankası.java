package interfacee;

public final class Bbankas� implements I {

    private String bankaAd�;
    private String terminalID;
    private String password;

    Bbankas�(String bankaAd�,String terminalID,String password){
        this.bankaAd�=bankaAd�;
        this.terminalID=terminalID;
        this.password=password;
    }
    public String getBankaAd�(){
        return bankaAd�;
    }

    public void setBankaAd�(){
        this.bankaAd�=bankaAd�;
    }

    public String getTerminalID(){
        return terminalID;
    }

    public void setTerminalID(){
        this.terminalID=terminalID;
    }

    public String getPassword(){

        return password;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("B bankas�na ba�lan�ld�.");
        return true;
    }

    @Override
    public boolean payment(String userPassword, double price, String cardNumber, String expireDate, String cvc) {
        return true;
    }
}
