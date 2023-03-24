package Generic.homework;

import java.util.Arrays;

public class Mylist<T> {

    private int capacity = 10;
    private T[] array;

    private T[] temparray;


    //Bo� constructor metod

    public Mylist() {
        this.array = (T[]) (new Object[capacity]);
    }

    public Mylist(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[this.capacity];
    }

    //dizinin kapasite de�erini d�nd�r�r
    public int getCapacity() {
        return capacity;
    }

    //kapasite de�erini de�i�tiren metod
    public void setCapacity(int capacity) {
        this.capacity = capacity;
        array = (T[]) new Object[this.capacity];
    }

    //dizinin eleman say�s�n� verir
    public int size() {
        int sizee = 0;
        for (int i = 0; i < getCapacity(); i++) {
            if (array[i] != null) {
                sizee++;
            }
        }
        return sizee;
    }

    //Diziye eleman ekleme metodu. E�er dizide kapasite yok ise dizinin boyutunu 2 kat�na c�kar�r
    public void add(T object) {
        if (size() >= getCapacity()) { //dizi boyutu dolu ise
            this.temparray = this.array;
            setCapacity(getCapacity() * 2);
            this.array = (T[]) new Object[getCapacity()];
            this.array = Arrays.copyOf(this.temparray, getCapacity());
        }
        this.array[size()] = object;
    }

    // dizinin indexteki de�erini d�nd�r�r
    public T get�ndex(int index) {
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

    //ge�erli index de�eri var m� yok mu kontrol� sa�layan metod.
    public boolean isvalidindex(int index){
        return index<size();
    }

    //verilen indexteki de�eri de�i�tirir.
    public T set(int index,T object){
        if(!(isvalidindex(index))){
            return null;
        }else {
            this.array[index]=object;
            return this.array[index];
        }
    }

    //dizi elemanlar�n� listeler
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
