package day14_Recap;

import java.util.Scanner;

public class Address {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your building number: ");
        int buildingNum = input.nextInt();

        input.nextLine();

        System.out.println("Street address: ");
        String address = input.nextLine();

        System.out.println("City name: ");
        String cityName = input.nextLine();

        System.out.println("State Name: ");
        String state = input.next();

        System.out.println("Zip code");
        int zip = input.nextInt();

        input.nextLine();

        System.out.println("Full name of the person");
        String fullName = input.nextLine();

        System.out.println( "\nShip To; " + fullName + "\n" + buildingNum + " " + address + "\n"
                + "\n" + cityName + state + zip);
    }
}
