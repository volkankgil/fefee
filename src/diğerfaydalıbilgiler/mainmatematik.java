package di�erfaydal�bilgiler;

public class mainmatematik {
    public static void main(String[] args) {

       matematik toplama= (a,b) -> a+b;
       matematik ��karma= (a,b) -> a-b;
       matematik �arpma= (a,b) -> a*b;
       matematik b�lme= (a,b) -> {
           if (b==0){
               b=1;
           }
           return a/b;
        };

        System.out.println(toplama.transaction(10,2));
        System.out.println(��karma.transaction(20,4));
        System.out.println(b�lme.transaction(10,0));

       /* matematik toplama=new matematik() {
            @Override
            public int transaction(int a, int b) {
                return a + b;
            }
        };

            matematik ��karma =new matematik() {
                @Override
                public int transaction(int a, int b) {
                    return a-b;
                }
            };

            matematik �arpma=new matematik() {
                @Override
                public int transaction(int a, int b) {
                    return a*b;
                }
            };

            matematik b�lme=new matematik() {
                @Override
                public int transaction(int a, int b) {
                    if(b==0) {
                        b = 1;
                    }
                    return a/b;
                }
            };

        System.out.println(toplama.transaction(10,2));*/
        }
    }
