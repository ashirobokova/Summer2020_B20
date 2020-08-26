package day41_Static;


public class printingCustomClassObjects {
    public static void main(String[] args) {
        String str = new String("Cybertak");
        System.out.println(str.toString()); // object name
        System.out.println(new String("School").toString()); // object

        System.out.println( str.toString() );
        System.out.println(new String("School"));
    }
}
