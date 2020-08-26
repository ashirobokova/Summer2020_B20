package day18_ForLoop;


import java.util.Scanner;

public class quize {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int longer = word.length();

        String result = "";

        if(longer == 5){
            char c1 = word.charAt(0);
            char c2 = word.charAt(1);
            char c3 = word.charAt(2);
            char c4 = word.charAt(3);
            char c5 = word.charAt(4);
            result = "" +c5+c4+c3+c2+c1;
        }else if (longer > 5){
            result = "Too long!";
        }else {
            result = "Too short!";
        }
        System.out.println(result);

    }
}