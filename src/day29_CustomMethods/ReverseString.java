package day29_CustomMethods;

public class ReverseString {
    public static void main(String[] args) {
        reverse("Alena");
    }

    public static void reverse(String str){
        String result = "";
        for(int i = str.length()-1; i >=0; i--){
            result +=str.charAt(i);
        }
        System.out.println(result);
    }

}
