package day07_Unary_ShortHand;

public class Post_VS_Pre {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a); //11
        System.out.println(a); //11

        System.out.println("==========================");

        int b = 10;
        System.out.println(b++);//10
        System.out.println(b); //11

        System.out.println("+++++++++++++++");

        int c = 25;
        int d = c++; // d = 25
        // c = 26





        System.out.println(d);
        System.out.println(c);

        System.out.println("================");

        int e = 25;
        e++;
        System.out.println(e);
        int A =1;// A=0
        A = -A-- + A++ / -A-- * --A;
        //A = -1 +0/-1*-1
        //A = -1

        System.out.println(A);

        int f = 50;
        f = --f + f++ + f-- + f++; // f=49;
        //49 + 49 + 50 + 49
        // 197

        System.out.println(f);

        int x =4;
        int y = x * 4 - x++;
        // 4*4 - 4
        // 12
        System.out.println(y);
        System.out.println(x);





    }

}
