package day18_ForLoop;

public class Email {
    public static void main(String[] args) {
        String email = "cybertek@gmail.com";
        //              012345678
        int index1 = email.indexOf("@");
        int index2 = email.lastIndexOf(".");

        String domain = email.substring(index1 +1, index2); // gmail
        System.out.println(domain);



    }
}
