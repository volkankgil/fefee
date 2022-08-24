package Generic;

public class genericmethod {

    String s; //undefined bir tanýmlamadýr.

    String s1=null; // hafýzada yer tutuyor. karþýsýnda deðer kutucuðu var ama içi boþ.

    String s2=""; //empty , hafýzada alan var. içinin doluluðu boþ

    public static <T,U> void printarry(T arr[],U arr2[]){
        for (T i:arr) {
            System.out.println(i);
        }

        for (U j:arr2) {
            System.out.println(j);
        }
    }

    public static void main(String[] args) {

        String a[] = {"volkan,marin,tümay"};
        Integer b[] = {10, 20, 30, 40};
        Character c[] = {'j', 'a', 'v', 'a'};

        //printarry(a);
        System.out.println("***********");
        //printarry(b);
        printarry(a,b);

    }
    }
