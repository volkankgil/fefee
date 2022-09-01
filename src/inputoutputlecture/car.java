package inputoutputlecture;

import javax.print.DocFlavor;
import java.io.Serializable;  //serialization ý import etmek zorundayýz.

public class car implements Serializable{

    private String brand;
    private String model;
public car(String brand,String model){
    this.brand=brand;
    this.model=model;
}

public String getBrand(){
    return this.brand;
}

public void setBrand(String brand){
    this.brand=brand;
}

public String getModel(){
    return this.model;
}

public void setModel(String model){
    this.model=model;
}
}
