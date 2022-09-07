package PatikaStore;

import java.util.Scanner;

import java.util.*;


public class notebook extends �r�n�zellikleri{

    Scanner input=new Scanner(System.in);
    private int notebookNumberIDcontrol = 0;
    private static HashSet<Integer> notebookID = new HashSet<>();
    public static LinkedHashMap<Integer,notebook> notebooklist = new LinkedHashMap<>();
    int Ram ;
    int Depolama;
    double EkranBoyutu;

    public notebook(String Marka�smi, int Markaid, int �r�nid, String �r�nad�, int �r�nbirimfiyat, int �r�nindirimoran�, int �r�nstokmiktar�, int Ram, int depolama, double ekranBoyutu){
        super(Marka�smi,Markaid,�r�nid,�r�nad�,�r�nbirimfiyat,�r�nindirimoran�,�r�nstokmiktar�);
        this.Ram=Ram;
        this.Depolama=depolama;
        this.EkranBoyutu=ekranBoyutu;
    }
    public notebook(){
    }
    @Override
    public void menu(){
        System.out.println("1 - Notebooklar� listele" + "\n" +
                "2 - Notebook ekle" + "\n" +
                "3 - Notebook sil" + "\n" +
                "4 - Notebooklar� ID ye g�re filtreleme");
        int number = input.nextInt();

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

    public void control(int control){
        while (notebookID.contains(control)){
            System.out.println("bu �d zaten kullanl�yor. tekrar �d giriniz");
            control=input.nextInt();
        }
        notebookID.add(control);
    }
    public void addProduct() {
        System.out.println("�r�n �d'si giriniz:");
        �r�nid=input.nextInt();
        control(�r�nid);

        System.out.print("�r�n�n fiyat�n� giriniz: ");
        �r�nbirimfiyat = input.nextInt();

        System.out.print("�r�n�n indirim oran�n� giriniz: ");
        �r�nindirimoran� = input.nextInt();

        System.out.print("�r�n�n sto�unu giriniz: ");
        �r�nstokmiktar�= input.nextInt();

        System.out.print("�r�n�n ismini giriniz: ");
        �r�nad�= input.nextLine();
        �r�nad�=input.nextLine();

        System.out.print("�r�n�n Markas�n� se�iniz");
        for (brand b : brand.markalistele) {
            System.out.print(b.getMarka�smi() + " ");
        }
        setMarka�smi(input.nextLine());

        System.out.print("�r�n�n ramini giriniz: ");
        Ram = input.nextInt();

        System.out.print("�r�n�n depolama alan?n? giriniz: ");
        Depolama = input.nextInt();

        System.out.print("�r�n�n ekran boyutunu giriniz: ");
        EkranBoyutu = input.nextDouble();

        notebookNumberIDcontrol = �r�nid;

        notebooklist.put(notebookNumberIDcontrol, new notebook(getMarka�smi(), getMarkaid(), �r�nid, �r�nad�, �r�nbirimfiyat, �r�nindirimoran�, �r�nstokmiktar�, Ram, Depolama,EkranBoyutu))  ;
        show();
    }
    public void show() {
        System.out.println("Notebook listesi");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID    | �r�n Ad�           | Fiyat�          | Markas�         | Sto�u        | �ndirim Oran�      | RAM    | Ekran Boyutu      | Haf�zas�   |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

        for (notebook notebookkk : notebooklist.values()) {
            System.out.printf("| %-2s | %-22s | %-12s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | \n",
            +notebookkk.get�r�nid(),
            notebookkk.get�r�nad�(),
            notebookkk.get�r�nbirimfiyat(),
            notebookkk.getMarka�smi(),
            notebookkk.get�r�nstokmiktar�(),
            notebookkk.get�r�nindirimoran�(),
            notebookkk.getRam(),
            notebookkk.getEkranBoyutu(),
            notebookkk.getDepolama());
        }
    }

    public void delete(){
        System.out.println("Hangi �r�n� silecekseniz ID'sini giriniz:");
        int number=input.nextInt();
        notebooklist.remove(number);
        notebookID.remove(number);
        show();
    }
    public void search(){
        System.out.println("Arayaca��n�z id:");
        int number=input.nextInt();
        if(notebookID.contains(number)){
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("| ID | �r�n Ad�                  | Fiyat�          | Markas�         | Sto�u        | �ndirim Oran�      | RAM    | Ekran Boyutu      | Haf�zas�   |");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

            System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | \n",
                    notebooklist.get(number).get�r�nid(),
                    notebooklist.get(number).get�r�nad�(),
                    notebooklist.get(number).get�r�nbirimfiyat(),
                    notebooklist.get(number).getMarka�smi(),
                    notebooklist.get(number).get�r�nstokmiktar�(),
                    notebooklist.get(number).get�r�nindirimoran�(),
                    notebooklist.get(number).getRam(),
                    notebooklist.get(number).getEkranBoyutu(),
                    notebooklist.get(number).getDepolama());
                    }else{
            System.out.println("B�yle bir �r�n yoktur.");
        }
    }
    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    public int getDepolama() {
        return Depolama;
    }

    public void setDepolama(int depolama) {
        Depolama = depolama;
    }
    public double getEkranBoyutu() {
        return EkranBoyutu;
    }
    public void setEkranBoyutu(double ekranBoyutu) {
        EkranBoyutu = ekranBoyutu;
    }
}
