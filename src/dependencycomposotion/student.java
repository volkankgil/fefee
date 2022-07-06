package dependencycomposotion;

public class student {

    private String name;
    private String surname;
    private int idno;
    private String adreess;

    private int note;


    public student(String name,String surname,int idno,String adreess,int note){
        this.name=name;
        this.surname=surname;
        this.idno=idno;
        this.adreess=adreess;
        this.note=note;
        if(note<0){
           this.note=0;
        }
    }

    public String getName(){
        System.out.println(this.name);
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getSurname(){
        return this.surname;
    }

    public void setSurname(){
        this.surname=surname;
    }

    public int getIdno() {
        return idno;
    }

    public void setIdno(int idno) {
        this.idno = idno;
    }

    public String getAdreess(){
         System.out.println(this.adreess);
         return this.adreess;
    }

    public void setAdreess(String adreess){
        this.adreess=adreess;
    }

    public int getNote(){
        return this.note;
    }

    public void setNote(int note){
        this.note=note;
    }
}
