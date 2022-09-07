package PatikaStore;

import java.util.*;

public class telefon extends �r�n�zellikleri{

    public static HashSet<Integer>telefonID=new HashSet<>();

    int telefonidcontrolnumber =0;

    public static LinkedHashMap<Integer,telefon>telefonekle=new LinkedHashMap<>();

    Scanner input=new Scanner(System.in);
    int telefonunhaf�zas�;    //(128 GB, 64 GB)

    double EkranBoyutu; //(6.1 Inc)

    int PilG�c�; //(4000)

    int RAM ;   //(6 MB)

    String Renk;   //(Siyah,K�rm�z�,Mavi

    public telefon(String Marka�smi, int Markaid, int �r�nid, String �r�nad�, int �r�nbirimfiyat, int �r�nindirimoran�, int �r�nstokmiktar�, int telefonunhaf�zas�, double EkranBoyutu, int PilG�c�, int RAM, String renk){
        super(Marka�smi,Markaid,�r�nid,�r�nad�,�r�nbirimfiyat,�r�nindirimoran�,�r�nstokmiktar�);
        this.telefonunhaf�zas�=telefonunhaf�zas�;
        this.EkranBoyutu=EkranBoyutu;
        this.PilG�c�=PilG�c�;
        this.RAM=RAM;
        this.Renk=renk;
    }

    public telefon(){
        // bo� telefon constructor'�n� store da olu�turdu�umuz telefon nesnesi i�in yaz�yoruz. storeda olu�turdu�umuz nesne ile menu metodunu �a��r�yoruz.
    }

    public void menu(){
        System.out.println("1 - Cep telefonalar� listele" + "\n" +
                "2 - Cep telefonu ekle" + "\n" +
                "3 - Cep telefonu sil" + "\n" +
                "4 - Cep telefonu ID ye g�re filtreleme");

        int number=input.nextInt();
        switch (number){
            case 1:
                show();
                break;
            case 2:
                addProduct();
                break;
            case 3:
                delete();
                break;
            case 4:
                search();
                break;
        }
    }

    public void control(int say�){
     while (telefonID.contains(say�)){
         System.out.println("Bu �r�n kay�tl� ba�ka id giriniz.");
         say�=input.nextInt();
     }
         telefonID.add(say�);
     }
    @Override
    public void addProduct() {
        System.out.println("�r�n id'si giriniz:");
        �r�nid=input.nextInt();
        control(�r�nid);

        System.out.println("�r�n ad�");
        �r�nad�=input.nextLine();
        �r�nad�=input.nextLine();

        System.out.println("�r�n fiyat�:");
        �r�nbirimfiyat=input.nextInt();

        System.out.println("�r�n Markas�:");
        for (brand b:markalistele) {
            System.out.print(b.getMarka�smi()  +  "  ");
        }
        setMarka�smi(input.nextLine());
        setMarka�smi(input.nextLine());

        System.out.println("�r�n Sto�u:");
        �r�nstokmiktar�=input.nextInt();

        System.out.println("indirim Oran�:");
        �r�nindirimoran�=input.nextInt();

        System.out.println("RAM:");
        RAM=input.nextInt();

        System.out.println("Ekran Boyutu:");
        EkranBoyutu=input.nextDouble();

        System.out.println("Telefon Haf�za:");
        telefonunhaf�zas�=input.nextInt();

        System.out.println("Pil g�c�:");
        PilG�c�=input.nextInt();

        System.out.println("Renk:");
        Renk= input.nextLine();
        Renk= input.nextLine();

        telefonidcontrolnumber=�r�nid;   // �r�n id'ye e�itledi�imizde , hassetteki value de�erlerine atama yap�yor.

        telefonekle.put(telefonidcontrolnumber,new telefon(getMarka�smi(),getMarkaid(),�r�nid,�r�nad�,�r�nbirimfiyat,�r�nindirimoran�,�r�nstokmiktar�,telefonunhaf�zas�,EkranBoyutu,RAM,PilG�c�,Renk));
    }

    @Override
    public void delete() {
        System.out.println("Hangi �r�n� silecekseniz numaras�n� giriniz:");
        int number=input.nextInt();
        telefonekle.remove(number);
        telefonID.remove(number);
    }

    public void show(){

        System.out.println("Notebook listesi");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID    | �r�n Ad�           | Fiyat�          | Markas�         | Sto�u        | �ndirim Oran�      | RAM    | Ekran Boyutu      | Haf�zas�   | Pil G�c� |  Renk  |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

        for(telefon tel:telefonekle.values()){
            System.out.printf("| %-2s | %-22s | %-12s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | %-6s | %-10s \n",
            +tel.get�r�nid(),
            tel.get�r�nad�(),
            tel.get�r�nbirimfiyat(),
            tel.getMarka�smi(),
            tel.get�r�nstokmiktar�(),
            tel.get�r�nindirimoran�(),
            tel.getRAM(),
            tel.getEkranBoyutu(),
            tel.getTelefonunhaf�zas�(),
            tel.getPilG�c�(),
            tel.getRenk());
        }
    }
    @Override
    public void search() {
        System.out.println("Arayaca��n�z ID giriniz.");
        int �dselect=input.nextInt();

        if(telefonID.contains(�dselect)){
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | �r�n Ad?                  | Fiyat?          | Markas?         | Sto?u        | ?ndirim Oran?      | RAM    | Ekran Boyutu      | Haf?zas?   | Pil Kapasitesi  | Renk           | Kamera    |");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | %-15s | %-14s | \n",

            +telefonekle.get(�dselect).get�r�nid(),
            telefonekle.get(�dselect).get�r�nad�(),
            telefonekle.get(�dselect).get�r�nbirimfiyat(),
            telefonekle.get(�dselect).getMarka�smi(),
            telefonekle.get(�dselect).get�r�nstokmiktar�(),
            telefonekle.get(�dselect).get�r�nindirimoran�(),
            telefonekle.get(�dselect).getRAM(),
            telefonekle.get(�dselect).getEkranBoyutu(),
            telefonekle.get(�dselect).getTelefonunhaf�zas�(),
            telefonekle.get(�dselect).getPilG�c�(),
            telefonekle.get(�dselect).getRenk());
        }else {
            System.out.println("b�yle bir id yoktur.");
        }
    }
    public int getTelefonunhaf�zas�() {
        return telefonunhaf�zas�;
    }

    public void setTelefonunhaf�zas�(int telefonunhaf�zas�) {
        this.telefonunhaf�zas� = telefonunhaf�zas�;
    }

    public double getEkranBoyutu() {
        return EkranBoyutu;
    }

    public void setEkranBoyutu(double ekranBoyutu) {
        EkranBoyutu = ekranBoyutu;
    }

    public int getPilG�c�() {
        return PilG�c�;
    }

    public void setPilG�c�(int pilG�c�) {
        PilG�c� = pilG�c�;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getRenk() {
        return Renk;
    }

    public void setRenk(String renk) {
        Renk = renk;
    }


}
