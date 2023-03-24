package Multithread;

public class threadstop implements Runnable{ // javada bir kere kal�t�m al�nabildi�i i�in thread s�n�f�n� extend edemedi�imiz durumlarda runnable s�n�f�n� implemente ediyoruz.
    private String name;
    private int id;

    private boolean isrun=true;

    public threadstop(String name,int id){
        this.name=name;
        this.id=id;
    }

    @Override
    public void run() {
        System.out.println(this.name + " �al��t�.");
        System.out.println("-------------");

        int a=0;

        while (isrun){
            try {
                Thread.sleep(1000L*id);
            }catch (Exception e){
                e.getMessage();
            }
            System.out.println(this.name + ":" + a++ );
        }
    }

    public void threadstop(){
        isrun=false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
