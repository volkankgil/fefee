package Generic;

public class NullableString {

    private final String value;  // final tan�mland��� i�in set metodu olmuyor.

    public NullableString(String s) {
        this.value = s;
    }

    public String getValue() {
        return this.value;
    }

    public boolean isvalue() {
        if (getValue() == null) {
            return true;
        } else {
            return false;
        }
    }

    public void run() {
        if (isvalue()) {
            System.out.println("null");
        } else {
            System.out.println(this.value); // this kelimesi s�n�fa ait de�i�ken tan�mlar�n� �ap�rmam�za yar�yor.
        }
    }
}
