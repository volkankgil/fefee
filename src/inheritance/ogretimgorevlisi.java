package inheritance;

public class ogretimgorevlisi extends akademisyen{
    private int kapino;

    public ogretimgorevlisi(String adSoyad, String telefon, String eposta, String bol�m, String unvan,int kapino) {
        super(adSoyad, telefon, eposta, bol�m, unvan);
        this.kapino=kapino;
    }

    public int getKapino(){
        return kapino;
    }

    public void setKapino(){
        this.kapino=kapino;
    }
    @Override
    public String derseGir(String unvan2){
        return unvan2;
    }

}
