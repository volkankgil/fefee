package inheritance;

public abstract class akademisyen extends calýsan{

    private String bolüm;
    private String unvan;

    akademisyen(String adSoyad,String telefon,String eposta,String bolüm,String unvan){
        super(adSoyad,telefon,eposta);
        this.bolüm=bolüm;
        this.unvan=unvan;
    }

    public String getBolüm(){
        return bolüm;
    }
    public void setBolüm(String bolüm){
        this.bolüm=bolüm;
    }

    public String getUnvan(){
        return this.unvan;
    }
    public void setUnvan(String unvan){
        this.unvan=unvan;
    }

    public abstract String derseGir(String unvan);/*{
        return this.unvan;
    }*/// ABSTRACT METODLARIN BODY'SÝ OLAMAZ.KOD BLOKLARI OLMAZ.


    public void giris() {
        System.out.println(getAdSoyad() + " A kapýsýndan Giriþ yaptý.");
    }
}
