package sigortayönetimsistemi;

import java.util.*;

public abstract class account implements Comparable<account> {


    private User userrr;

    private List<insuarance> insuarances;

    private AuthenticationStatus status;

    enum AuthenticationStatus {SUCCESS, FAÝL}

    public User getUserrr() {
        return this.userrr;
    }

    public void setUserrr(User userrr) {
        this.userrr = userrr;
    }

    public List<insuarance> getInsuarances() {
        return insuarances;
    }

    public void setInsuarances(List<insuarance> insuarances) {
        this.insuarances = insuarances;
    }

    public AuthenticationStatus getStatus() {
        return status;
    }

    public void setStatus(AuthenticationStatus status) {
        this.status = status;
    }

    public final void showUserinfo() {
        System.out.println("Hesap Bilgileri :" + "\n" +
                "Adý: " + userrr.getUserName() + "\n" +
                "Soyadý: " + userrr.getUserLastname() + "\n" +
                "E-Posta: " + userrr.getEmail() + "\n" +
                "Mesleði: " + userrr.getJob() + "\n" +
                "Yaþý: " + userrr.getAge() + "\n" +
                "Son Giriþ: " + userrr.getSistemesongiriþtarihi());

        for (Adress adress : userrr.getAdreslistesi()) {
            System.out.println(adress);
        }
    }

    public void login(String email, String pass) throws InvalidAuthenticationException {
        if (email.equals(getUserrr().getEmail()) && pass.equals(getUserrr().getPassword())) {
            setStatus(AuthenticationStatus.SUCCESS);
            System.out.println("Giriþ Baþarýlý.");
        } else {
            setStatus(AuthenticationStatus.FAÝL);
            throw new InvalidAuthenticationException("Kullanýcý bilgileri hatalý !");
        }
    }

    public abstract void addAddress(String address);

    // public abstract void removeAddress(Address address);

    public void addInsuarance(insuarance insuaranceee) {
        insuaranceee.calculate();
        this.getInsuarances().add(insuaranceee);
    }

    @Override
    public int compareTo(account o) {
        return this.hashCode()-o.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(userrr);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        account account = (account) obj;
        return Objects.equals(userrr, account.userrr);
    }
}

class Induvial extends account{
    public Induvial(){
        this.setStatus(AuthenticationStatus.FAÝL);
        this.setInsuarances(new ArrayList<>());
    }

    public Induvial(User user){
        this();
        this.setUserrr(user);
    }

    @Override
    public void addAddress(String address){
        adressManager.addAdress(this.getUserrr(),new Homeadress(address));
    }
}

class Enterprise extends account{
    public Enterprise(){
        this.setStatus(AuthenticationStatus.FAÝL);
        this.setInsuarances(new ArrayList<>());
    }

    public Enterprise(User user){
        this();
        this.setUserrr(user);
    }

    @Override
    public void addAddress(String address) {
        adressManager.addAdress(this.getUserrr(),new Homeadress(address));
    }
}
