package day08_LogicalOperators;

public class Odd_Even {
    public static void main(String[] args) {

        int num = 99;
        boolean even = num % 2 ==0;
        boolean odd = !even;

        if(even) {
            System.out.println(num + " is even number");
        }

        if (odd) {
            System.out.println(num + " is odd number");
        }
    }
}
