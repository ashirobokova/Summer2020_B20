package day38_JavaRecap;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW", "Acura", "Tesla"));

        cars.retainAll(Arrays.asList("Tesla"));
        System.out.println(cars);

        System.out.println("=========================================");

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.addAll(Arrays.asList("Eggs", "Milk", "Paper", "Mango", "Pepsi"));

        boolean r1 = groceryList.contains("Pepsi"); //only if checking 1 item

        System.out.println(r1);
        System.out.println(groceryList);

        boolean r2 = groceryList.containsAll( Arrays.asList("Eggs", "Milk", "Orange"));
        System.out.println(r2);

        System.out.println("Total Number of Item: " + groceryList.size() );
        // set the dragon fruit to apple:
        groceryList.set(groceryList.size()-1, "Apple"); // replace element
        System.out.println(groceryList);

        groceryList.set(groceryList.indexOf("Milk"), "Dish Washer");
        System.out.println(groceryList);

        groceryList.clear(); // empty list
        System.out.println(groceryList);

    }
}
