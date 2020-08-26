package day31_Recap;

public class Methods_Practice {
    public static void main(String[] args) {
        max(1,4);
        int s = max2(10,5);
        System.out.println(s);
    }

    public static void max(int num1, int num2){
        int max = num1>num2 ? num1 : num2;
        System.out.println(max);
    }

    public static int max2(int num1, int num2){

        return (num1>num2) ? num1 : num2;

    }
}
