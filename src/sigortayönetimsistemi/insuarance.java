package sigortay�netimsistemi;

import java.util.Calendar;
import java.util.Date;

public abstract class insuarance {

    private String sigorta�smi;

    private double sigorta�creti;

    private Date sigortaba�lang��tarihi;

    private Date sigortabiti�tarihi;

    public String getSigorta�smi() {
        return sigorta�smi;
    }

    public void setSigorta�smi(String sigorta�smi) {
        this.sigorta�smi = sigorta�smi;
    }

    public double getSigorta�creti() {
        return sigorta�creti;
    }

    public void setSigorta�creti(double sigorta�creti) {
        this.sigorta�creti = sigorta�creti;
    }

    public Date getSigortaba�lang��tarihi() {
        return sigortaba�lang��tarihi;
    }

    public void setSigortaba�lang��tarihi(Date sigortaba�lang��tarihi) {
        this.sigortaba�lang��tarihi = sigortaba�lang��tarihi;
    }

    public Date getSigortabiti�tarihi() {
        return sigortabiti�tarihi;
    }

    public void setSigortabiti�tarihi(Date sigortabiti�tarihi) {
        this.sigortabiti�tarihi = sigortabiti�tarihi;
    }

    public abstract void calculate();
}

class healthinsuarance extends insuarance{

    @Override//SEYAHAT S�GORTASI
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
        this.setSigorta�smi("Alliance Ara� Sigortas�");
        this.setSigorta�creti(3000);
        this.setSigortaba�lang��tarihi(new Date());
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.YEAR,2);
        this.setSigortabiti�tarihi(calendar.getTime());
    }

    @Override
    public void calculate(){
        this.setSigorta�creti(getSigorta�creti()*1.2);
    }
}

class InvalidAuthenticationException extends Exception{

    public InvalidAuthenticationException(String message){
        super(message);
    }
        }
