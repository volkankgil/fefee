package interfacee;

public final class Bbankasý implements I {

    private String bankaAdý;
    private String terminalID;
    private String password;

    Bbankasý(String bankaAdý,String terminalID,String password){
        this.bankaAdý=bankaAdý;
        this.terminalID=terminalID;
        this.password=password;
    }
    public String getBankaAdý(){
        return bankaAdý;
    }

    public void setBankaAdý(){
        this.bankaAdý=bankaAdý;
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
        System.out.println("B bankasýna baðlanýldý.");
        return true;
    }

    @Override
    public boolean payment(String userPassword, double price, String cardNumber, String expireDate, String cvc) {
        return true;
    }
}
