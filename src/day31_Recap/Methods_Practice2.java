package day31_Recap;

public class Methods_Practice2 {
    public static void main(String[] args) {
        reverse1("Babochka");
        String name = "Babab";
        reverse2(name);
        System.out.println(name.equalsIgnoreCase(reverse2(name)));
    }

    public static void reverse1(String str) {
        String expectedresult = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            expectedresult += str.charAt(i);

        }
        System.out.println(expectedresult);

    }

    public static String reverse2(String str) {
        String expectedresult = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            expectedresult += str.charAt(i);

        }
        return expectedresult;

    }
}
