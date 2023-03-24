package encapsulation;

public class dataclass {

    private String carName;  //private yapt���m�z i�in sadece s�n�fa ait metodalarda de�i�kene eril�ebiliyoruz.
    private String model;
    private int price;

    public dataclass(String carName,String model,int price) {

        this.carName = carName;
        this.model = model;
        if (price > 0) {
            this.price = price;
        } else {
            this.price=0;

        }
        System.out.println(this.model);
    }

    public void printPrice(){
        System.out.println(this.price);
    }

    public void changePrice(int price){
        if(price<0) {
            this.price = 0;
        }else {
            this.price=price;
        }
    }

    public void getName(){
        System.out.println(this.carName);
    }

    public void setCarName(String carName){

        this.carName=carName;//dvdveveve
    }

}
