package day21_Loops;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 999999999;

        for (int i =1; i<=5; i++){
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if(num < min){
                min = num;
            }
        }
        System.out.println("Minimum number is: " + min);



    }

}
