package sigortayönetimsistemi;

public class main {
    public static void main(String[] args) {

        accountManager accountManager=new accountManager();
        account account=accountManager.login();
        System.out.println("Hoþgeldiniz" + account.getUserrr().getUserName() + " " + account.getUserrr().getUserLastname());
        account.addAddress("urfa/birecik");
        account.addAddress("Nizip / Gaziantep");
        account.addAddress("Çukurova / Adana");
        account.addInsuarance(new carinsuarance());
        account.showUserinfo();
    }
}
