package Generic.GenericInterface;

public interface Idatabase<T> {

    public boolean insert (T data);

    public boolean delete (T data);

    public boolean update (T data);

    public T select ();
}
