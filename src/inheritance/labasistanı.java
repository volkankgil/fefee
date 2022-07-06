package inheritance;

public class labasistaný extends asistan {

    public labasistaný(String adSoyad, String telefon, String eposta, String bolüm, String unvan, int ofisSaati) {
        super(adSoyad, telefon, eposta, bolüm, unvan, ofisSaati);
    }

    public void lablaraGir(){
        System.out.println(this.getAdSoyad() + this.getUnvan() + " lablara gir");
    }
}
