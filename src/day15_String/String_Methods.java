package day15_String;

public class String_Methods {
    public static void main(String[] args) {

        String name = "Cybertek School";
        //             01234567

        // chaeAt(index);
        char ch1 = name.charAt(0); // C
        char ch2 = name.charAt(5); // t

        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println("===========================================");
        // length() ==> int
        int l = name.length();
        System.out.println(l); // total num of characters in Cybertek

        int lastIndexNumber = name.length() - 1;
        System.out.println(lastIndexNumber);

        char lastCharecter = name.charAt(lastIndexNumber);
        System.out.println(lastCharecter);

        System.out.println("==========================================");

        // concat(Str):

        String schoolName = "Cybertek";
        schoolName = schoolName.concat(" School"); //"Cybertek School

        System.out.println(schoolName);

        String r1 = "Cybertek" + 123 + 'A' + true;
        System.out.println(r1);

        String r2 = "Cybertek".concat("123");

        System.out.println("==============================================");

        //toLowerCase();
        String name1 = "CYBERTEK SCHOOL";
        name1 = name.toLowerCase(); // "cybertek school"
        System.out.println(name1);

        // toUpperCase():
        String name2 = "alena";
        name2 = name2.toUpperCase(); // "ALENA"
        System.out.println(name2);

        // trim():
        String p = "     Cybertek School    ";
        p = p.trim();
        System.out.println(p);





    }
}
