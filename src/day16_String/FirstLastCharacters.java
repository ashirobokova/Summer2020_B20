package day16_String;

/*
Input:
abba
Output:
true
 */

import java.util.Scanner;

public class FirstLastCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() - 1);

        System.out.println(firstChar == lastChar);


    }
}
