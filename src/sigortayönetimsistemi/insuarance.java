package sigortayönetimsistemi;

import java.util.Calendar;
import java.util.Date;

public abstract class insuarance {

    private String sigortaÝsmi;

    private double sigortaücreti;

    private Date sigortabaþlangýçtarihi;

    private Date sigortabitiþtarihi;

    public String getSigortaÝsmi() {
        return sigortaÝsmi;
    }

    public void setSigortaÝsmi(String sigortaÝsmi) {
        this.sigortaÝsmi = sigortaÝsmi;
    }

    public double getSigortaücreti() {
        return sigortaücreti;
    }

    public void setSigortaücreti(double sigortaücreti) {
        this.sigortaücreti = sigortaücreti;
    }

    public Date getSigortabaþlangýçtarihi() {
        return sigortabaþlangýçtarihi;
    }

    public void setSigortabaþlangýçtarihi(Date sigortabaþlangýçtarihi) {
        this.sigortabaþlangýçtarihi = sigortabaþlangýçtarihi;
    }

    public Date getSigortabitiþtarihi() {
        return sigortabitiþtarihi;
    }

    public void setSigortabitiþtarihi(Date sigortabitiþtarihi) {
        this.sigortabitiþtarihi = sigortabitiþtarihi;
    }

    public abstract void calculate();
}

class healthinsuarance extends insuarance{

    @Override//SEYAHAT SÝGORTASI
    public void calculate(){
    //DOLDURULACAK
    }
}

class residenceinsuarence extends insuarance{

    @Override
    public void calculate(){

    }
}

class travelinsuarance extends insuarance {

    @Override
    public void calculate() {
    }
}

class carinsuarance extends insuarance{

    public carinsuarance(){
        this.setSigortaÝsmi("Alliance Araç Sigortasý");
        this.setSigortaücreti(3000);
        this.setSigortabaþlangýçtarihi(new Date());
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.YEAR,2);
        this.setSigortabitiþtarihi(calendar.getTime());
    }

    @Override
    public void calculate(){
        this.setSigortaücreti(getSigortaücreti()*1.2);
    }
}

class InvalidAuthenticationException extends Exception{

    public InvalidAuthenticationException(String message){
        super(message);
    }
        }
