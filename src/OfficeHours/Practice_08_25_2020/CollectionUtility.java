package OfficeHours.Practice_08_25_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class CollectionUtility {
    public static void main(String[] args) {

        //  swap Collection Method

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10,480,30,40,10,60,70,80));

        Collections.swap(list1, 0,1);

        System.out.println(list1);

        //  sort Collection Method
        Collections.sort(list1);
        System.out.println(list1);

        // max Collection Method
        Integer max = Collections.max(list1);
        System.out.println("Maximum number: "+ max);

        // min Collection Method
        Integer min = Collections.min(list1);
        System.out.println("Minimum number: "+ min);

        // frequency Collection Method
        String[] arr = {"Eggs", "Orange", "Milk", "Bread"};
        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList(arr));
        System.out.println(items);

        int count = Collections.frequency(items, "Milk");
        System.out.println(count);

        items.removeIf(I -> Collections.frequency(items, I) !=1); // remove the frequency
        System.out.println(items);




    }


}
