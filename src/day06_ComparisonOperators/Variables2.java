package day06_ComparisonOperators;

public class Variables2 {
    public static void main(String[] args) {
        char c1 = 'A'; //65 on ascii table
        char c2 = 'B'; //66 on ascii table

        System.out.println(c1+c2);
        int result = c1+c2;
        System.out.println(result);
        double d = c1+c2;
        System.out.println(d);
        int num1 = 'A';
        System.out.println(num1);
        double num2 = 'B';
        System.out.println(num2);

        char c4 = 65+45;
        System.out.println(c4);
        char c5 = 65;
        System.out.println(c5);
        char c7 = '1'; //49
        System.out.println(c7+1);
        System.out.println(c7); // char: '1'
        int r1 = c7;
        System.out.println(r1); //int: 49

        System.out.println("5+2 = " +3+4);
        System.out.println("5+2 = " + (3+4));
    }
}
