package day15_String;

import java.lang.String;


public class String_Intro {

    public static void main(String[] args) {
        String str = "Cybertek";
        //Scanner input = new Scanner(System.in);
        String s1 = "Cat";
        String s2 = "Cat";

        System.out.println(s1 == s2);

        String d1 = "Dog";// String literal
        String d2 = "dog";// String literal

        System.out.println(d1 == d2);

        String d3 = "Dog";// String literal
        String d4 = "Dog";// String literal

        System.out.println(d3 == d4);

        String t1 = new String("Tiger");
        String t2 = new String( "Tiger");
// new String("Tiger') == new String("Tiger") ==> false
        System.out.println(t1 == t2);

        String c1 = "Cybertek"; // String pool
        String c2 = new String ("Cybertek"); // heap
        String c3 = new String ("Cybertek"); // heap
        String c4 = "Cybertek";


        System.out.println(c1==c2);
        System.out.println(c1==c4);

        System.out.println("================================");










    }
}
