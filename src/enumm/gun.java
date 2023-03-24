package enumm;

public class gun {

    public static final gun PAZARTESÝ=new gun(1);
    public static final gun SALI=new gun(2);
    public static final gun ÇARSAMBA=new gun(3);
    public static final gun PERSEMBE=new gun(4);
    public static final gun CUMA=new gun(5);
    public static final gun CUMARTESÝ=new gun(6);
    public static final gun PAZAR=new gun(7);
    private int day;

    private gun (int day){   // private yaptýðýmýzda bu metoddan nesne üretilemiyor.
        this.day=day;
    }

    public int getDay(){
        return this.day;
    }

    public void setDay(int day){
        this.day=day;
    }
}
