package day34_WrapperClasses;

import javax.crypto.BadPaddingException;
import javax.crypto.spec.PSource;

public class WrapperClass_Methods {
    public static void main(String[] args) {

        String str = "123";
        int a = Integer.parseInt(str);

        System.out.println(str + 1);
        System.out.println(a + 1);

        Double d1 = Double.parseDouble("7.5");
        System.out.println(d1-1);

        String s1 = "False";
        boolean b1= Boolean.parseBoolean(s1);
        System.out.println(b1);

        System.out.println("========================================");

        String s2 = "100000000.5";
        Double d2 = Double.valueOf(s2);

    }
}