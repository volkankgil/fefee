package enumm; // enum s�f�n i�in class se�iminde enum 'u se�meliyiz.

public enum day {

    PAZARTES�(1), // NOKTALI V�RG�L �LE KAPATMAMALIYIZ. NOKTALI V�RG�L EN SON �NCE V�RG�L KONUR.
    SALI(2),
    CARSAMBA(3),
    PERSEMBE(4),
    CUMA(5),
    CUMARTES�(6),
    PAZAR(7);
    private int dayy;

    day(int dayy){
        this.dayy=dayy;
    }

    public int getDayy() {
        return dayy;
    }

    public void setDayy(int dayy) {
        this.dayy = dayy;
    }

    public void takeday(){
        String newday=null;
        switch (this.dayy){
            case 1:
                newday="PAZARTES���";
                System.out.println(getDayy());
                break;
            case 2:
                newday="SALI";
                System.out.println(getDayy());
                break;
            case 3:
                newday="CARSAMBA";
                System.out.println(getDayy());
        }
        System.out.println(newday);
    }
}
