package OfficeHours.Practice_07_06_2020;

import java.util.Scanner;

/*
write a program that can ask the user enter a number for five times and the
returns the sum of those five numbers
 */
public class SumOfFiveNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        System.out.println("Enter a number; ");
        int num1 = scan.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scan.nextInt();
        */

        int sum =0; // 10+20+30+40+50

        for (int i = 1; i <= 1000; i +=1){

            System.out.println("Enter a number; ");
            int num = scan.nextInt(); // 10, 20, 30, 40, 50

            sum += num;
        }
        System.out.println("Sum is: " + sum);





    }
}
