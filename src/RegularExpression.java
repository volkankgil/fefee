import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {

        // abc1 diye aratýr isek ayný sýrada string ifade de tarama yapar. case sensitivedir.
        // . bütün karakterlerin yerine geçer sadece nokta veya baþka bir karakter aramak ister isek \. veya \( yapmalýyýz. þimdi nokta veya parantezi tarar. 2 adet ifade tarayacaksak \.\.
        // \d = digit satýsal rakamlarý verir.   \D = Büyük D ise rakam olmayan bütün ifadeleri verir.
        // \w = sayý,rakam ve alt çizgiyi gösterir. \W =diðer bütün rakamlarý gösterir.   \s=boþluk alanlarý gösterir.   \S boþluk olmayan alanlarý gösterir.
        // ^ bu ifade ile baþlayan satýr demektir. ^volkan volkan ile baþlayan char veya stringleri gösterir. ^456 =sayýlar ilede kullanýlabilir.
        // $ iþareti satýr sonu bitiþini ifade eder.  456$ = 456 ile biten ifade olmalýdýr.

        //(321)1726 ve 3211726 regex ile ifade ediliþi = (\(\d\d\d\)|\d\d\d)\d\d\d\d$

        //[ab32-]= sýranýn önemi yok string'te ayrý ayrý a,b,3,2, - iþaretine bakýyor. -'nin baþta sonda olmasý gerekiyor. arada olursa aþaðýdaki gibi olur.

        // [0-9] = 0 ve 9 arasýndaki ifadeleri yakala demektir. [a-zA-Z0-9.()] KÜÇÜK a'dan z 'ye kadar, büyük a'dan büyük z'ye kadar , . iþareti,( açma ve kapama ) iþaretini yakalar.

        // [^1-4], [^a-z] = baþýna bu iþareti koyar isek 1,2,3,4 haricinde bütün rakamlarý gösterir.

        // ar([a-z]|\d)

        // /d{5} = 5 tane sýralý digit anlamýna gelir.  \d{2,5} = 2,3,4,5 rakamlý sayýlara bakar. \d{6,}  =6 rakamlý ve büyüklerini kabul et demek.

        // \d{3}-?\d{2}-?\d{2}  = 3 tane digit sayý bakar yana yana sonra soru iþareti ile birlikte - varmý yok mu diye bakar.

        Pattern pattern=Pattern.compile("agent \\d\\d\\d");
        Matcher matcher=pattern.matcher("agent 00");

        Pattern pattern2=Pattern.compile("agent \\d{3}");
        Matcher matcher2=pattern2.matcher("agent 00");

        Pattern pattern3=Pattern.compile("agent \\d{4,}");
        Matcher matcher3=pattern3.matcher("agent 00435");

        Pattern pattern4=Pattern.compile("agent \\d{4,7}");
        Matcher matcher4=pattern4.matcher("agent 00231551");

        Pattern pattern5=Pattern.compile("^MaRÝN\\d");
        Matcher matcher5=pattern5.matcher("MaRÝN3");

        Pattern pattern6=Pattern.compile("^(M|m|mm)aRÝN\\d");
        Matcher matcher6=pattern6.matcher("mmaRÝN3");

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
