package enumm; // enum sýfýn için class seçiminde enum 'u seçmeliyiz.

public enum day {

    PAZARTESÝ(1), // NOKTALI VÝRGÜL ÝLE KAPATMAMALIYIZ. NOKTALI VÝRGÜL EN SON ÖNCE VÝRGÜL KONUR.
    SALI(2),
    CARSAMBA(3),
    PERSEMBE(4),
    CUMA(5),
    CUMARTESÝ(6),
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
                newday="PAZARTESÝÝÝ";
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
