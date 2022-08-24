package Generic;

public class NullablegenericInteger<T> { // elmas i�areti koyarak genericmethod s�n�f tan�mlad�k.

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
            System.out.println("De�er atanmam��t�r. ");
        }else {
            System.out.println(this.getValue());
        }
    }
}
