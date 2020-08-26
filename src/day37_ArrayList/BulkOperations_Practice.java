package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("Masha");
        students.add("Misha");
        students.add("Asya");
        students.add("John");
        students.add("Mat");
        // verify that the names John, Alena are contained in student list

        boolean r1 =  students.containsAll(Arrays.asList("Alena", "John", "Ramazan"));
        System.out.println(r1);
        System.out.println("============================");

        ArrayList<Integer>numbers = new ArrayList<>();
        // add: 30, 25, 40, 15, 55, 65, 75, 85, 100

       /* Integer [] nums = {30, 25, 40, 15, 55, 65, 75, 85, 100 };
        numbers.addAll(Arrays.asList(nums))
        */
        numbers.addAll(Arrays.asList(30, 25, 40, 15, 55, 65, 75, 85, 100));
        System.out.println(numbers);
    }
}
