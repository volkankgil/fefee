package Generic.homework;

public class mainMylist {
    public static void main(String[] args) {

        Mylist<Integer> mylist =new Mylist<>();

        System.out.println(mylist.getCapacity());
        mylist.add(20);
        mylist.add(21);
        mylist.add(22);
        mylist.add(23);
        mylist.add(24);

        System.out.println(mylist.size());
        System.out.println(mylist.getCapacity());
        System.out.println(mylist.getındex(4));
        System.out.println(mylist.lastIndexOf(25));
        mylist.clear();
        System.out.println(mylist.size());
        mylist.add(28);
        mylist.add(25);
        mylist.add(30);
        System.out.println(mylist.isvalidindex(2));
        System.out.println(mylist.set(10,5));
        System.out.println(mylist.toString());

    }
}
