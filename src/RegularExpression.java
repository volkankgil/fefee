import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {

        // abc1 diye arat�r isek ayn� s�rada string ifade de tarama yapar. case sensitivedir.
        // . b�t�n karakterlerin yerine ge�er sadece nokta veya ba�ka bir karakter aramak ister isek \. veya \( yapmal�y�z. �imdi nokta veya parantezi tarar. 2 adet ifade tarayacaksak \.\.
        // \d = digit sat�sal rakamlar� verir.   \D = B�y�k D ise rakam olmayan b�t�n ifadeleri verir.
        // \w = say�,rakam ve alt �izgiyi g�sterir. \W =di�er b�t�n rakamlar� g�sterir.   \s=bo�luk alanlar� g�sterir.   \S bo�luk olmayan alanlar� g�sterir.
        // ^ bu ifade ile ba�layan sat�r demektir. ^volkan volkan ile ba�layan char veya stringleri g�sterir. ^456 =say�lar ilede kullan�labilir.
        // $ i�areti sat�r sonu biti�ini ifade eder.  456$ = 456 ile biten ifade olmal�d�r.

        //(321)1726 ve 3211726 regex ile ifade edili�i = (\(\d\d\d\)|\d\d\d)\d\d\d\d$

        //[ab32-]= s�ran�n �nemi yok string'te ayr� ayr� a,b,3,2, - i�aretine bak�yor. -'nin ba�ta sonda olmas� gerekiyor. arada olursa a�a��daki gibi olur.

        // [0-9] = 0 ve 9 aras�ndaki ifadeleri yakala demektir. [a-zA-Z0-9.()] K���K a'dan z 'ye kadar, b�y�k a'dan b�y�k z'ye kadar , . i�areti,( a�ma ve kapama ) i�aretini yakalar.

        // [^1-4], [^a-z] = ba��na bu i�areti koyar isek 1,2,3,4 haricinde b�t�n rakamlar� g�sterir.

        // ar([a-z]|\d)

        // /d{5} = 5 tane s�ral� digit anlam�na gelir.  \d{2,5} = 2,3,4,5 rakaml� say�lara bakar. \d{6,}  =6 rakaml� ve b�y�klerini kabul et demek.

        // \d{3}-?\d{2}-?\d{2}  = 3 tane digit say� bakar yana yana sonra soru i�areti ile birlikte - varm� yok mu diye bakar.

        Pattern pattern=Pattern.compile("agent \\d\\d\\d");
        Matcher matcher=pattern.matcher("agent 00");

        Pattern pattern2=Pattern.compile("agent \\d{3}");
        Matcher matcher2=pattern2.matcher("agent 00");

        Pattern pattern3=Pattern.compile("agent \\d{4,}");
        Matcher matcher3=pattern3.matcher("agent 00435");

        Pattern pattern4=Pattern.compile("agent \\d{4,7}");
        Matcher matcher4=pattern4.matcher("agent 00231551");

        Pattern pattern5=Pattern.compile("^MaR�N\\d");
        Matcher matcher5=pattern5.matcher("MaR�N3");

        Pattern pattern6=Pattern.compile("^(M|m|mm)aR�N\\d");
        Matcher matcher6=pattern6.matcher("mmaR�N3");

        boolean found=matcher.find();
        System.out.println(found);

        boolean found2=matcher2.find();
        System.out.println(found2);

        boolean found3=matcher3.find();
        System.out.println(found3);

        boolean found4=matcher4.find();
        System.out.println(found4);

        boolean found5=matcher5.find();
        System.out.println(found5);

        boolean found6=matcher6.find();
        System.out.println(found6);

        String cardnumber="1234-2222-3333-4343";
        // "XXXX-XXXX-XXXX-4343"

        Pattern pattern7=Pattern.compile("\\d{4}-\\d{4}-\\d{4}-");
        Matcher matcher7=pattern7.matcher(cardnumber);

        String maskedCardNumber=matcher7.replaceAll("XXXX-XXXX-XXXX-");
        System.out.println(maskedCardNumber);

        boolean found7=matcher7.find();
        System.out.println(found7);


        System.out.println(Pattern.matches("[0-9]","45"));
    }
}
