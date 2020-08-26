package day30_CusromMethods_Recap;

public class ReturnMethod2 {
    public static void main(String[] args) {
        String name = "Java";
        //   returnString(name);
        //   System.out.println(name.equalsIgnoreCase( returnString(name)));
       String reverse =  returnString2(name);

    }

    public static void returnString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);

        }
        System.out.println(result);
    }

    public static String returnString2(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);

        }
        return result;
    }
}