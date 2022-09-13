package sigortayönetimsistemi;

import java.util.*;

import java.util.Date;

public class User {

    private String userName;

    private String userLastname;

    private String email;

    private String password;

    private String job;

    private int age;

    private ArrayList <Adress> adreslistesi;

    private Date sistemesongiriþtarihi=null;

    public User(String userName, String userLastname, String email, String password, String job, int age){
        this.userName=userName;
        this.userLastname=userLastname;
        this.email=email;
        this.password=password;
        this.job=job;
        this.age=age;
        this.adreslistesi=new ArrayList<>();
    }

    public User(){
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastname() {
        return userLastname;
    }

    public void setUserLastname(String userLastname) {
        this.userLastname = userLastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Adress> getAdreslistesi() {
        return adreslistesi;
    }

    public void setAdreslistesi(ArrayList<Adress> adreslistesi) {
        this.adreslistesi = adreslistesi;
    }

    public Date getSistemesongiriþtarihi() {
        return sistemesongiriþtarihi;
    }

    public void setSistemesongiriþtarihi(Date sistemesongiriþtarihi) {
        this.sistemesongiriþtarihi = sistemesongiriþtarihi;
    }

    public int hashcode(){
        return Objects.hash(email);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return Objects.equals(email,user.email);
    }

}

