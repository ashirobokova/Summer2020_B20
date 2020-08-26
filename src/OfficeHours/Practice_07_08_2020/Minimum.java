package OfficeHours.Practice_07_08_2020;

import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int min = 999999999; //whatever user enter it will always be less than 99999999

    for(int i = 0; i <5; i++){

        System.out.println("Enter the number:");
        int n = scan.nextInt();

        if(n < min){
            min = n;
        }

    }
        System.out.println("mim is: "+min);


    }

}
