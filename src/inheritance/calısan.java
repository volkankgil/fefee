package inheritance;

public class cal�san {

    private String adSoyad;
    private String telefon;
    private String eposta;

    cal�san(String adSoyad,String telefon,String eposta){
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
        System.out.println(this.adSoyad+ "�niversiteye giri� yapt�.");
    }

    public void giris(String girissaati){       //methodlarda overloading
        System.out.println(girissaati+ " giri� yapt�.");
    }

    public void giris(String girissaati,String c�k�ssaati){     //methodlarda overloading
        System.out.println(girissaati+ " giri� yapt� " + c�k�ssaati + " ��k�� yapt�." );
    }

    public void cikis(){
        System.out.println(this.adSoyad+ "�niversiteden ��k�� yapt�.");
    }

    public void yemekhane(){
        System.out.println(this.adSoyad+ "yemejhaneye giri� yapt�.");
    }

    public static void girisYapanlar(cal�san[] loginuserrs){
        for (cal�san c:loginuserrs) {
            c.giris();
        }
    }
}
