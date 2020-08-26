package day32_MethodOverLoading;

public class MethodOverloading2 {

    public static void main(String[] args) {
        addition2Numbers(10,4);
        addition3Numbers(10,20,4);
        addition4Numbers(4,5,6,4);
        System.out.println("===================================");

        addition(4,5);
        addition(4,5,4);
        addition(4,5,86,8);
    }
    public static void addition2Numbers (double a, double b){
        System.out.println(a+b);
    }
    public static void addition3Numbers(double a, double b, double c){
        System.out.println(a+b+c);
    }
    public static void addition4Numbers(double a, double b, double c, double d){
        System.out.println(a+b+c+d);
    }

    //=========================================================================

    public static void addition(double a, double b){
        System.out.println(a+b);
    }
    public static void addition(double a, double b, double c){
        System.out.println(a+b+c);
    }
    public static void addition(double a, double b, double c, double d){
        System.out.println(a+b+c+d);
    }

}
