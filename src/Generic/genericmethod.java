package Generic;

public class genericmethod {

    String s; //undefined bir tan�mlamad�r.

    String s1=null; // haf�zada yer tutuyor. kar��s�nda de�er kutucu�u var ama i�i bo�.

    String s2=""; //empty , haf�zada alan var. i�inin dolulu�u bo�

    public static <T,U> void printarry(T arr[],U arr2[]){
        for (T i:arr) {
            System.out.println(i);
        }

        for (U j:arr2) {
            System.out.println(j);
        }
    }

    public static void main(String[] args) {

        String a[] = {"volkan,marin,t�may"};
        Integer b[] = {10, 20, 30, 40};
        Character c[] = {'j', 'a', 'v', 'a'};

        //printarry(a);
        System.out.println("***********");
        //printarry(b);
        printarry(a,b);

    }
    }
