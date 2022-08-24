package Generic;

public class NullablegenericInteger<T> { // elmas iþareti koyarak genericmethod sýnýf tanýmladýk.

    private final T value;

    NullablegenericInteger(T value){
        this.value=value;
    }

    public T getValue() {
        return this.value;
    }

    public boolean isnull(){
        return this.getValue()==null;
    }

    public void run(){
        if(isnull()){
            System.out.println("Deðer atanmamýþtýr. ");
        }else {
            System.out.println(this.getValue());
        }
    }
}
