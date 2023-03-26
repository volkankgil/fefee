package diðerfaydalýbilgiler;

public class mainmatematik {
    public static void main(String[] args) {

       matematik toplama= (a,b) -> a+b;
       matematik çýkarma= (a,b) -> a-b;
       matematik çarpma= (a,b) -> a*b;
       matematik bölme= (a,b) -> {
           if (b==0){
               b=1;
           }
           return a/b;
        };

        System.out.println(toplama.transaction(10,2));
        System.out.println(çýkarma.transaction(20,4));
        System.out.println(bölme.transaction(10,0));

       /* matematik toplama=new matematik() {
            @Override
            public int transaction(int a, int b) {
                return a + b;
            }
        };

            matematik çýkarma =new matematik() {
                @Override
                public int transaction(int a, int b) {
                    return a-b;
                }
            };

            matematik çarpma=new matematik() {
                @Override
                public int transaction(int a, int b) {
                    return a*b;
                }
            };

            matematik bölme=new matematik() {
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
