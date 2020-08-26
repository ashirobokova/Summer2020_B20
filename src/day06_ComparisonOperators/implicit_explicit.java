package day06_ComparisonOperators;

public class implicit_explicit {
    public static void main(String[] args) {

        // Implicit casting from small to large (does automaticly)

        short s1 = 100;
        long l1 = s1; // implicit casting: automaticly done

        long l2 = (long) s1; // manual implicit casting same as: long l1 = s1;

        int I1 = 300;
        double D1 = I1; //
        System.out.println(D1);

        double D2 = (double)I1;
        System.out.println(D2);

        //Explicit from large to small
        double d1 =400.55;
        int i1 = (int)d1;
        System.out.println(i1);

        long L1 = 4400;
        short sh1 = (short)L1;
        System.out.println(sh1);

        int n1 = 1000;
        byte b1 = (byte)n1;
        System.out.println(b1);

        double m1 = 34.5;
        float f1 = (float)m1;
        System.out.println(f1);






    }
}
