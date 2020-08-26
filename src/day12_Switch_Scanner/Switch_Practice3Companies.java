package day12_Switch_Scanner;

public class Switch_Practice3Companies {
    public static void main(String[] args) {

        String productName = "MacBook";

        switch (productName){
            case "Galaxy":
                System.out.println("Samsung");
                break;

            case "iphone":
            case "MacBook":
            case "ipad":
                System.out.println("Apple");
                break;



        }
    }

}
