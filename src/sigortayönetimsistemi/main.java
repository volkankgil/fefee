package sigortay�netimsistemi;

public class main {
    public static void main(String[] args) {

        accountManager accountManager=new accountManager();
        account account=accountManager.login();
        System.out.println("Ho�geldiniz" + account.getUserrr().getUserName() + " " + account.getUserrr().getUserLastname());
        account.addAddress("urfa/birecik");
        account.addAddress("Nizip / Gaziantep");
        account.addAddress("�ukurova / Adana");
        account.addInsuarance(new carinsuarance());
        account.showUserinfo();
    }
}
