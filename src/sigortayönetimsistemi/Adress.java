package sigortayönetimsistemi;

public interface Adress {

    String getAdress();
}

class Homeadress implements Adress{

    private String adress;

    public Homeadress(String adress){
        this.adress=adress;
    }

    public String getAdress(){
        return this.adress;
    }

    public void setAdress(String adress){
        this.adress=adress;
    }
}

class businessAdress{

    private String adress;

    public businessAdress(String adress){
        this.adress=adress;
    }

    public String getAdress(){
        return this.adress;
    }

    public void setAdress(String adress){
        this.adress=adress;
    }
}

class adressManager{
    public static void addAdress(User user,Adress adress){
        user.getAdreslistesi().add(adress);
    }

    public static void removeAdress(User user,Adress adress){
        user.getAdreslistesi().remove(adress);
    }
}
