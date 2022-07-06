package inheritance;

public class calýsan {

    private String adSoyad;
    private String telefon;
    private String eposta;

    calýsan(String adSoyad,String telefon,String eposta){
        this.adSoyad=adSoyad;
        this.telefon=telefon;
        this.eposta=eposta;
    }

    public String getAdSoyad(){
        return adSoyad;
    }
    public void setAdSoyad(String adSoyad){
        this.adSoyad=adSoyad;
    }

    public String getTelefon(){
        return telefon;
    }
    public void setTelefon(String telefon){
        this.telefon=telefon;
    }

    public String getEposta(){
        return eposta;
    }
    public void setEposta(){
        this.eposta=eposta;
        System.out.println(eposta);
    }

    public void giris(){
        System.out.println(this.adSoyad+ "üniversiteye giriþ yaptý.");
    }

    public void giris(String girissaati){       //methodlarda overloading
        System.out.println(girissaati+ " giriþ yaptý.");
    }

    public void giris(String girissaati,String cýkýssaati){     //methodlarda overloading
        System.out.println(girissaati+ " giriþ yaptý " + cýkýssaati + " çýkýþ yaptý." );
    }

    public void cikis(){
        System.out.println(this.adSoyad+ "üniversiteden çýkýþ yaptý.");
    }

    public void yemekhane(){
        System.out.println(this.adSoyad+ "yemejhaneye giriþ yaptý.");
    }

    public static void girisYapanlar(calýsan[] loginuserrs){
        for (calýsan c:loginuserrs) {
            c.giris();
        }
    }
}
