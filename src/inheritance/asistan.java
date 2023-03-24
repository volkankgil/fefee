package inheritance;

public class asistan extends akademisyen {
    private int ofisSaati;

    public asistan(String adSoyad, String telefon, String eposta, String bolüm, String unvan, int ofisSaati) {
        super(adSoyad, telefon, eposta, bolüm, unvan);
        this.ofisSaati = ofisSaati;
    }

    public int getOfisSaati() {
        return ofisSaati;
    }

    public void setOfisSaati(int ofisSaati) {
        this.ofisSaati = ofisSaati;
    }

    public void quizYap() {
        System.out.println(getAdSoyad() + "quiz yapacak.");
    }

    @Override
    public String derseGir(String ünvan) {//akademisyen deki abstract olan metodu override ettil.
        return ünvan;
    }
}
