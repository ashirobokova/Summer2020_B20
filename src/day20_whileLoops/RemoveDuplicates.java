package day20_whileLoops;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine(); //ab
        //            0123

        String result = "";

        for(int i = 0; i <= str.length()-1; i+=1){
           String s = "" + str.charAt(i); // a, a, b, b
            if( !result.contains(s) ){ // if the character is already contained in result we'll not added
                result += s;
            }
        }
        System.out.println(result);
    }
}
