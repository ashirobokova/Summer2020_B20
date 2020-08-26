package day16_String;

public class String_Methods {
    public static void main(String[] args) {

        String email = "Cybertek@gmai.com";
        email = email.replace ("gmail", "yahoo"); //
        System.out.println(email);

        String word = "java";
        word =word.replace("a","e"); // "jeve"
        System.out.println(word);

        String sentence = "I like to lear Java, Java is cool, Java is fun";
        sentence = sentence.replace("a, Java", "a, C#");

        sentence.replace( "Java ", "Python");

        System.out.println(sentence);

        String s1 = "I like to stay in Cybertek, Cybertek is nice place";
        s1 = s1.replace("Cybertek, ", "MIT, ");
        System.out.println(s1);
        System.out.println("==========================================");

        String s2 = "I like to leaRn Java";

        s2 = s2.replace('R', 'r'); // I like to learn Java

        System.out.println(s2);
        System.out.println("============================================");

        String s5 = "I like to stay in Cybertek, we are learning java";
        int r1 = s5.indexOf("r");
        int r2 = s5.indexOf("re"); //returns the first char 'r' index
        System.out.println(r1);
        System.out.println(r2);

        String s6 = "Java is a programming Language, and Java is fun";

        int I1 = s6.indexOf("Java is fun");
        int I2 = s6.lastIndexOf("J");
        System.out.println(I1);
        System.out.println(I2);

        String s7 = "Java";
        int a1 = s7.indexOf("A");
        System.out.println("=======================================");
        String s8 = "Java";
        int a = s8.indexOf("a"); //cannot be assingned to double or flot

        char ch = s8.charAt(a);

        System.out.println(s8);


    }
}
