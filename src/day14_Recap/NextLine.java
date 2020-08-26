package day14_Recap;
import java.util.Scanner;

public class NextLine {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in); //Enter

        System.out.println("Enter you age: ");
        int age = input.nextInt();// 19Enter

         input.nextLine(); //lets print nextLine


        System.out.println("Enter your full Mane: ");
        String fullName = input.nextLine();

        System.out.println(fullName + " is " + age + " years old");

    }
}
