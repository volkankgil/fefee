package inheritance;

public class bilgii�lem extends memur{

    private String g�rev;

    public bilgii�lem(String adSoyad,String telefon,String eposta,String departman,int mesai,String g�rev){
        super(adSoyad,telefon,eposta,departman,mesai);
        this.g�rev=g�rev;
    }

    public String getG�rev(){
        return this.g�rev;
    }
    public void setG�rev(String g�rev){
        this.g�rev=g�rev;
    }

    public String networkKurulum(String say�){
        this.g�rev=say�;
        return say�;
    }
}
