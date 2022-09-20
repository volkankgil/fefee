package KitapListesi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;

public class book {

    String bookName;

    int bookPageNumber;

    String bookAuthor;

    String bookPublishmentdate;

    public book(String bookName, int bookPageNumber, String bookAuthor, String bookPublishmentdate) {
        this.bookName = bookName;
        this.bookPageNumber = bookPageNumber;
        this.bookAuthor = bookAuthor;
        this.bookPublishmentdate = bookPublishmentdate;
    }

    public book() {

    }

    public String getBookName() {
        return this.bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPageNumber() {
        return this.bookPageNumber;
    }

    public void setBookPageNumber(int bookPageNumber) {
        this.bookPageNumber = bookPageNumber;
    }

    public String getBookAuthor() {
        return this.bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPublishmentdate() {
        return this.bookPublishmentdate;
    }

    public void setBookPublishmentdate(String bookPublishmentdate) {
        this.bookPublishmentdate = bookPublishmentdate;
    }

    public void kitapnesneüret() {

        List<book> kitapliste = new ArrayList<>();

        kitapliste.add(new book("Silahlara Veda", 13, "a", "2015"));
        kitapliste.add(new book("Sefiller", 200, "b", "2016"));
        kitapliste.add(new book("Anna KARANA", 300, "c", "2017"));
        kitapliste.add(new book("BABALAR VE OÐULLAR", 4, "d", "2018"));
        kitapliste.add(new book("SEMERKANT", 150, "e", "2019"));
        kitapliste.add(new book("DOÐUDAN UZAKTA", 24, "f", "2020"));
        kitapliste.add(new book("DEVLET", 56, "g", "2024"));
        kitapliste.add(new book("KÖRLÜK", 523, "h", "2029"));
        kitapliste.add(new book("GÖRMEK", 453, "l", "2032"));
        kitapliste.add(new book("TUTANAMAYANLAR", 542, "k", "2055"));

        for (book a : kitapliste) {
            System.out.println(" Book Name: " + a.bookName + " Page Number : " + a.bookPageNumber + " Book Author: " + a.bookAuthor + " Book publishment date = " + a.bookPublishmentdate);
        }

        /*Iterator <book>itr=kitapliste2.iterator();

        while (itr.hasNext()) {
        System.out.println(itr.next().getBookName());
        }*/// kitap liste2'yi yazdýrma

        System.out.println("-----------------------------------------------------------------------------------------------------------------");

        ArrayList<book>kitapliste2=new ArrayList<>(kitapliste);

        kitapliste2.stream().filter(book -> book.getBookPageNumber()>60).sorted(Comparator.comparing(book::getBookPageNumber).reversed()).forEach(book -> System.out.println(book.getBookName()+ "    " + book.getBookPageNumber()+ "    " + book.getBookAuthor()+ "    " + book.getBookPublishmentdate()));

        System.out.println("----------------------------------------------------------------------------------------------------------");

        HashMap<String,String>mapoluþtur=new HashMap<>();

        kitapliste.stream().forEach(book -> mapoluþtur.put(book.getBookName(),book.getBookAuthor()));
        for(String i:mapoluþtur.keySet()){
            System.out.println("Book Name: " + i + "\n AuthorName : " + mapoluþtur.get(i) );
        }
    }
}
