package inheritance;

public class labasistan� extends asistan {

    public labasistan�(String adSoyad, String telefon, String eposta, String bol�m, String unvan, int ofisSaati) {
        super(adSoyad, telefon, eposta, bol�m, unvan, ofisSaati);
    }

    public void lablaraGir(){
        System.out.println(this.getAdSoyad() + this.getUnvan() + " lablara gir");
    }
}
