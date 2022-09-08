package Multithread;

public class threadstop implements Runnable{
    private String name;
    private int id;

    private boolean isrun=true;

    public threadstop(String name,int id){
        this.name=name;
        this.id=id;
    }

    @Override
    public void run() {
        System.out.println(this.name + "Çalýþtý.");
        System.out.println("-------------");
        for (int i=0;i<=100;i++){
            try {
                Thread.sleep(800L*id);
            }catch (Exception e){
                e.getMessage();
            }
            System.out.println(this.name + ":" + i );
        }
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
