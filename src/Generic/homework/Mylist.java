package Generic.homework;

import java.util.Arrays;

public class Mylist<T> {

    private int capacity = 10;
    private T[] array;

    private T[] temparray;


    //Boþ constructor metod

    public Mylist() {
        this.array = (T[]) (new Object[capacity]);
    }

    public Mylist(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[this.capacity];
    }

    //dizinin kapasite deðerini döndürür
    public int getCapacity() {
        return capacity;
    }

    //kapasite deðerini deðiþtiren metod
    public void setCapacity(int capacity) {
        this.capacity = capacity;
        array = (T[]) new Object[this.capacity];
    }

    //dizinin eleman sayýsýný verir
    public int size() {
        int sizee = 0;
        for (int i = 0; i < getCapacity(); i++) {
            if (array[i] != null) {
                sizee++;
            }
        }
        return sizee;
    }

    //Diziye eleman ekleme metodu. Eðer dizide kapasite yok ise dizinin boyutunu 2 katýna cýkarýr
    public void add(T object) {
        if (size() >= getCapacity()) { //dizi boyutu dolu ise
            this.temparray = this.array;
            setCapacity(getCapacity() * 2);
            this.array = (T[]) new Object[getCapacity()];
            this.array = Arrays.copyOf(this.temparray, getCapacity());
        }
        this.array[size()] = object;
    }

    // dizinin indexteki deðerini döndürür
    public T getýndex(int index) {
        if (index > size() || index < 0) {
        }
        return array[index];
    }

    // verilen nesnenin en son hangi indexte oldugunu verir.
    public int lastIndexOf(T object){
        for (int i=size()-1;i>=0;i--){
            if(this.array[i]==object){
                return i;
            }
        }
        return -1;
    }

    //listeyi siler
    public void clear(){
        this.array=(T[]) new Object[getCapacity()];
    }

    //geçerli index deðeri var mý yok mu kontrolü saðlayan metod.
    public boolean isvalidindex(int index){
        return index<size();
    }

    //verilen indexteki deðeri deðiþtirir.
    public T set(int index,T object){
        if(!(isvalidindex(index))){
            return null;
        }else {
            this.array[index]=object;
            return this.array[index];
        }
    }

    //dizi elemanlarýný listeler
    @Override
    public String toString(){
        return Arrays.toString(array);
    }

    public boolean contains(T object){
        for(T obj:this.array){
            if(obj.equals(object)){
                return true;
            }
        }
        return false;
    }

}
