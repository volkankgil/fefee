package PatikaStore;

public abstract class �r�n�zellikleri extends brand {

    int �r�nid;

    String �r�nad�;

    int �r�nbirimfiyat;

    int �r�nindirimoran�;

    int �r�nstokmiktar�;


    public �r�n�zellikleri(String Marka�smi, int Markaid, int �r�nid, String �r�nad�, int �r�nbirimfiyat, int �r�nindirimoran�, int �r�nstokmiktar�){
        super(Marka�smi,Markaid);
        this.�r�nid=�r�nid;
        this.�r�nad�=�r�nad�;
        this.�r�nbirimfiyat=�r�nbirimfiyat;
        this.�r�nindirimoran�=�r�nindirimoran�;
        this.�r�nstokmiktar�=�r�nstokmiktar�;
    }

    public �r�n�zellikleri(){

    }

    public abstract void menu();
    public abstract void addProduct();

    public abstract void delete();
    public abstract void search();
    public int get�r�nid() {
        return �r�nid;
    }

    public void set�r�nid(int �r�nid) {
        this.�r�nid = �r�nid;
    }

    public String get�r�nad�() {
        return �r�nad�;
    }

    public void set�r�nad�(String �r�nad�) {
        this.�r�nad� = �r�nad�;
    }

    public int get�r�nbirimfiyat() {
        return �r�nbirimfiyat;
    }

    public void set�r�nbirimfiyat(int �r�nbirimfiyat) {
        this.�r�nbirimfiyat = �r�nbirimfiyat;
    }

    public int get�r�nindirimoran�() {
        return �r�nindirimoran�;
    }

    public void set�r�nindirimoran�(int �r�nindirimoran�) {
        this.�r�nindirimoran� = �r�nindirimoran�;
    }

    public int get�r�nstokmiktar�() {
        return �r�nstokmiktar�;
    }

    public void set�r�nstokmiktar�(int �r�nstokmiktar�) {
        this.�r�nstokmiktar� = �r�nstokmiktar�;
    }
}
