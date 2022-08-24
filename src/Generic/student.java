package Generic;

import Generic.GenericInterface.Idatabase;

public class student <T> implements Idatabase<T> {

    @Override
    public boolean insert(T data) {
        System.out.println("Veri eklendi.");
        System.out.println(data);
        return true;
    }

    @Override
    public boolean delete(T data){
        System.out.println("Veri Silindi.");
        return true;
    }

    @Override
    public boolean update(T data){
        System.out.println("Veri güncellendi.");
        return true;
    }

    @Override
    public T select(){
        System.out.println("Veri Çekildi.");
        return null;
    }


}
