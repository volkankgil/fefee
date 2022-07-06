package inheritance;

public class memur extends calısan{
    private String departman;
    private int mesai;

    public memur(String adSoyad,String telefon,String eposta,String departman,int mesai){
        super(adSoyad,telefon,eposta);
        this.departman=departman;
        this.mesai=mesai;
    }

    public String getDepartman(){
        return departman;
    }
    public void setDepartman(){
        this.departman=departman;
    }

    public int getMesai() {
        return mesai;
    }

    public void setMesai(int mesai) {
        this.mesai = mesai;
    }

    @Override
    public void giris(){
        System.out.println(getAdSoyad()+ " D kapısından giriş yaptı.");
    }
}
