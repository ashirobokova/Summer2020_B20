package day20_whileLoops;


import java.util.Scanner;

public class WhileLoop_Practice3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pass = "Cybertek123";
        System.out.println("Enter your password");

        String input = scan.nextLine();

        while( !input.equals(pass)){
            System.out.println("Please re-enter your password");
            input = scan.nextLine();
        }

        System.out.println("Logged in");
    }
}
