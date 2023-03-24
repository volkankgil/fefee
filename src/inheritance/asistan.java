package inheritance;

public class asistan extends akademisyen {
    private int ofisSaati;

    public asistan(String adSoyad, String telefon, String eposta, String bol�m, String unvan, int ofisSaati) {
        super(adSoyad, telefon, eposta, bol�m, unvan);
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
    public String derseGir(String �nvan) {//akademisyen deki abstract olan metodu override ettil.
        return �nvan;
    }
}
