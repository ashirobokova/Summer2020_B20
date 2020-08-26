package day18_ForLoop;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        String str = "Java";
        // avaJ ===. ava, J
        String s1 = str.substring(1); // ava
        String s2 = str.substring(0,1); // J

        String result1 = s1+s2; // avaJ
        System.out.println(result1);

        String str1 = "Peca";

        char ch1 = str1.charAt(0);
        char ch2 = str1.charAt(1);
        char ch3 = str1.charAt(2);
        char ch4 = str1.charAt(3);

        System.out.println("" +ch4 +ch3+ch2+ch1);





    }

}
