package Generic;

public class main {
    public static void main(String[] args) {

        Integer a=30;

        NullableString n=new NullableString(null);
        n.run();

        NullableInteger ni=new NullableInteger(a);
        ni.run();
        System.out.println("******");
        NullablegenericInteger<Integer> volkan=new NullablegenericInteger<>(null);
        volkan.run();





    }

}
