package day12_Switch_Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
        int n1 =100;
        int n2 = 200;
        int n3 = 300;



        boolean n1IsBigger = n1 > n2 && n1 > n3;
        boolean n2IsBigger = n2 > n1 && n2 > n3;

        String result = (n1IsBigger)?"n1 is bigger":(n2IsBigger)? "n2 is bigger":
                "n3 is bigger";
        System.out.println(result);

    }

}
