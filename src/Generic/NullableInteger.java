package Generic;

public class NullableInteger {

    private final Integer number;

    public NullableInteger(Integer number){
        this.number=number;
    }

    public Integer getNumber(){
        return this.number;
    }

    public boolean isnull(){
       return getNumber()==null;
    }

    public void run(){
        if(isnull()){
            System.out.println("null");
        }else {
            System.out.println(this.number);
        }
    }
}
