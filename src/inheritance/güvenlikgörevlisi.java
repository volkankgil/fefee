package inheritance;

public class g�venlikg�revlisi extends memur{
    private String belge;

    public g�venlikg�revlisi(String adsoyad,String telefon,String eeposta,String departman,int mesai,String belge){
        super(adsoyad,telefon,eeposta,departman,mesai);
        this.belge=belge;
    }

    public String getBelge(){
        return this.belge;
    }
    public void setBelge(String belge){
        this.belge=belge;
    }

    public void n�bet(String belge){
        System.out.println(this.belge=belge + "nolu belgeyi istedi.");
    }
}
