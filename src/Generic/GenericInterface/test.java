package Generic.GenericInterface;

import Generic.student;

public class test <t1,t2,t3> { //3 tane genericmethod sýnýf alabileceðini belirtiyor.

    private t1 obj1;
    private t2 obj2;
    private t3 obj3;

    public test(t1 obj1, t2 obj2, t3 obj3){
        this.obj1=obj1;
        this.obj2=obj2;
        this.obj3=obj3;
    }


    public t1 getObj1(){
        return this.obj1;
    }

    public void setObj1(t1 obj1) {
        this.obj1 = obj1;
    }

    public t2 getObj2() {
        return obj2;
    }

    public void setObj2(t2 obj2) {
        this.obj2 = obj2;
    }

    public t3 getObj3() {
        return obj3;
    }

    public void setObj3(t3 obj3) {
        this.obj3 = obj3;
    }

    public void showinfo(){
        System.out.println(this.obj1.getClass().getName());  // getClass dediðimizde obj1 'in sýnýfýndan name i çaðýrýyor.
        System.out.println(this.obj2.getClass().getName());
        System.out.println(this.obj3.getClass().getName());
    }

    public static void main(String[] args) {

        Integer e=10;
        String f="fe";
        Double g=3.2;

        test<Integer,String,Double> t=new test<>(e,f,g);  // 3 adet genericmethod sýnýf var ise constructorda 3 adet tanýmlamak zorundayýz.
        t.showinfo();
        System.out.println("*********");
        student<String> stu=new student<>();
        stu.insert("abc");
    }
}
