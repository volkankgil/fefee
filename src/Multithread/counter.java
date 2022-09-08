package Multithread;

public class counter extends Thread {
    String name;

    public counter(String name){
        this.name=name;
    }

    @Override
    public void run() {
        for(int i=1;i<100;i++){
            System.out.println(this.name + " : " + i);
        }
    }
}
