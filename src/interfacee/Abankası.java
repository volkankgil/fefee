package interfacee;

public class Abankasý implements I,IDeneme {//bir sýnýfa birden fazla interface implement edebiliriz.Ayný zamanda bir sýnýf hem
    //kalýtým hemde interface ini bir sýnýfýn alabilir.

    private String bankaAdý;
    private String terminalID;
    private String password;


    Abankasý(String bankaAdý,String terminalID,String password){
        this.bankaAdý=bankaAdý;
        this.terminalID=terminalID;
        this.password=password;
    }
    public int userPassword;

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("Kullanýcý ip : " + ipAddress);
        System.out.println("Makine ip : " + this.HOST_IP_ADRESS);

            System.out.println(this.bankaAdý + " baðlanýldý");
            return true;
        }

    @Override
    public boolean payment(String userPassword, double price, String cardNumber, String expireDate, String cvc){
    return true;
    }

    public String getBankaAdý(){
        return bankaAdý;
    }

    public void setBankaAdý(String bankaAdý){
        this.bankaAdý=bankaAdý;
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
