package inheritance;

public abstract class akademisyen extends cal�san{

    private String bol�m;
    private String unvan;

    akademisyen(String adSoyad,String telefon,String eposta,String bol�m,String unvan){
        super(adSoyad,telefon,eposta);
        this.bol�m=bol�m;
        this.unvan=unvan;
    }

    public String getBol�m(){
        return bol�m;
    }
    public void setBol�m(String bol�m){
        this.bol�m=bol�m;
    }

    public String getUnvan(){
        return this.unvan;
    }
    public void setUnvan(String unvan){
        this.unvan=unvan;
    }

    public abstract String derseGir(String unvan);/*{
        return this.unvan;
    }*/// ABSTRACT METODLARIN BODY'S� OLAMAZ.KOD BLOKLARI OLMAZ.


    public void giris() {
        System.out.println(getAdSoyad() + " A kap�s�ndan Giri� yapt�.");
    }
}
