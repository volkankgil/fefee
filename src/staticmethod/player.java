package staticmethod;

public class player {
    private String name;
    private int score;

    public static int remainingtime=15;

    player(String name,int score){
        this.name=name;
        this.score=score;
        remainingtime++;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name1){
        this.name=name1;
    }

    public int getScore(){
        return this.score;
    }

    public void setScore(int score1){
        this.score=score1;
    }

    public static boolean injury(){
        int fall=0;
        if(fall==0){
        }return true;
    }

}
