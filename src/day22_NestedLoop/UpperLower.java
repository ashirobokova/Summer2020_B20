package day22_NestedLoop;

import java.util.Scanner;

public class UpperLower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string ");
        String word = scan.next();

        char ch1 = word.charAt(0);
        char ch2 = word.charAt(word.length()-1);

        boolean start = ch1 >= 'A' && ch1 <= 'Z'; //condition for Upper case character
        boolean end = ch2 >= 'a' && ch2 <= 'z'; // lower case

        System.out.println(start && end);


    }
}
