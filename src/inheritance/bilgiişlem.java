package inheritance;

public class bilgiiþlem extends memur{

    private String görev;

    public bilgiiþlem(String adSoyad,String telefon,String eposta,String departman,int mesai,String görev){
        super(adSoyad,telefon,eposta,departman,mesai);
        this.görev=görev;
    }

    public String getGörev(){
        return this.görev;
    }
    public void setGörev(String görev){
        this.görev=görev;
    }

    public String networkKurulum(String sayý){
        this.görev=sayý;
        return sayý;
    }
}
