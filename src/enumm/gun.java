package enumm;

public class gun {

    public static final gun PAZARTES�=new gun(1);
    public static final gun SALI=new gun(2);
    public static final gun �ARSAMBA=new gun(3);
    public static final gun PERSEMBE=new gun(4);
    public static final gun CUMA=new gun(5);
    public static final gun CUMARTES�=new gun(6);
    public static final gun PAZAR=new gun(7);
    private int day;

    private gun (int day){   // private yapt���m�zda bu metoddan nesne �retilemiyor.
        this.day=day;
    }

    public int getDay(){
        return this.day;
    }

    public void setDay(int day){
        this.day=day;
    }
}
