package kitapsýralayacý;

import java.util.Comparator;

public class book {

    private String bookname;
    private int pagenumber;
    private String writerName;
    private int publishmentDate;

    public book(String bookname,int pagenumber,String writerName,int publishmentDate){
        this.bookname=bookname;
        this.pagenumber=pagenumber;
        this.writerName=writerName;
        this.publishmentDate=publishmentDate;
    }

    public String getBookname(){
        return this.bookname;
    }

    public void setBookname(String bookname){
        this.bookname=bookname;
    }

    public int getPagenumber(){
        return this.pagenumber;
    }

    public void setPagenumber(int pagenumber){
        this.pagenumber=pagenumber;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public int getPublishmentDate() {
        return publishmentDate;
    }

    public void setPublishmentDate(int publishmentDate) {
        this.publishmentDate = publishmentDate;
    }


}


