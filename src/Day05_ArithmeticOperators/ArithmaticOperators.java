package Day05_ArithmeticOperators;

public class ArithmaticOperators {

    public static void main(String[] args) {
        System.out.println(20+3-2+1);
        System.out.println(20*3);
        System.out.println(2+3-1*4);
        System.out.println(10/3);//int/int ==>int
        System.out.println(10.0/3);//double/int ==> double
        System.out.println(10/3.0);//int/double ==> double
        int outcome = 12+6/3;
        System.out.println(outcome);
        System.out.println(10%4);
        //              10/4 =2
        //              10 - (4*2) =2
        System.out.println(30 % 8);
        //                 30 /8 =3
        //                 30 - (8*3)
        //                 30 - 24 = 6
        System.out.println(99 % 4);
        //                 99/4 = 24
        //                 99-(4*24)
        //                 99-96=3
        System.out.println(5+2*4);


    }
}
