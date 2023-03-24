package encapsulation;

public class dataclass {

    private String carName;  //private yaptýðýmýz için sadece sýnýfa ait metodalarda deðiþkene erilþebiliyoruz.
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
