package day07_Unary_ShortHand;

import java.sql.SQLOutput;

/*
1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
            year = 2020  ==> short;
            LeapYear =true/false;
        output:
            2020 is leap year: true
            Assume that any year that can be divisble by 4 is leap year

2. write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true

 */
public class warmUpTask {
    public static void main(String[] args) {
        int year = 2022;
        boolean result = year % 4 == 0;
        System.out.println("Year "+ year+" " +result); // 2021 is leap year: false

        int num = 70;
        boolean res1 = num % 2 ==0;
        boolean res2 = num % 3 == 0;
        boolean res3 = num % 5 == 0;

        System.out.println(num + " is divisible by 2: " + res1);
        System.out.println(num + " is divisible by 3: " +res2);
        System.out.println(num + " is divisible by 5: " +res3);






    }



}
