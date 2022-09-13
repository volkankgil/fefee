package sigortayönetimsistemi;

import java.util.Scanner;
import java.util.TreeSet;

public class accountManager {

    private TreeSet<account>accounts=new TreeSet<>();

    public accountManager(){
        accounts.add(new Enterprise(new User("volkan","kebapcýgil","volkankgil@gmail.com","abc","mühendis",34)));
        accounts.add(new Enterprise(new User("tümay","kebapcýgil","tumaykgil@gmail.com","efg","mühendis",30)));
        accounts.add(new Induvial(new User("berkan","kebap","berkkgil@gmail.com","cvb","ekonomist",27)));
    }

    public TreeSet<account>getAccounts(){
        return this.accounts;
    }

    public void setAccounts(TreeSet<account>accounts){
        this.accounts=accounts;
    }

    public account login(){
        String[]infos=getLoginInfos();

        account tempAccount=null;

        for(account acc:accounts){
            if(acc.getUserrr().getEmail().equals(infos[0])){
                tempAccount=acc;
                break;
            }
        }

        if(tempAccount!=null){
            try{
                tempAccount.login(infos[0],infos[1]);
            }catch (InvalidAuthenticationException e){
                throw new RuntimeException();
            }
        }
        return tempAccount;
    }

    public String[] getLoginInfos(){
        String []infos=new String[2];
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen giriþ yapmak için bilgilerinizi giriniz:");
        System.out.print("E-Posta: ");
        infos[0]=input.nextLine();
        System.out.println("Þifre");
        infos[1]=input.nextLine();
        return infos;
    }
}
