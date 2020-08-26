package OfficeHours.Practice_8_24_2020;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/*
addAll: (CollectionType)
removeAll;
retainAll:
containAll:
 */

public class ArraysList_Recap {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(); // size is 0
        //                                object
        list1.addAll(Arrays.asList(10,20,30,40,50,60));
        System.out.println( list1);

        for(int each : list1 ){
            System.out.println(each);
        }

        System.out.println("=============================");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll( Arrays.asList(30,40,50,60,70,80,90,100,200));

        // remove: 40,50,90,200

        list2.removeAll(Arrays.asList(40,50,90,200));

        System.out.println(list2);

        /*
        swap
        sort
        max
        min
        freguency
         */

        Collections.swap(list2, 0, list2.size()-1); // swap first and last elements
        System.out.println(list2);

        System.out.println(list2.get(0)); // first index
        System.out.println(list2.get(list2.size()-1)); // last index

        //arr[0] = 300
        list2.set(0, 300); // change index 0 with new element
        System.out.println(list2);

        Collections.sort(list2); // sort elements in assorted order
        System.out.println(list2);

        System.out.println("=================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Alena", "Peca", "Ahmed", "Ahmed", "Igor", "Rade"));

        names.removeIf(p -> p.equals("Ahmed") );

        System.out.println(names);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(50,65,45,55,75,85,98,100,87,40,52,62,35));
        numbers.removeIf(p-> p<60); //removes all number less than 60
        // p (predicate) present each element
        System.out.println(numbers);





    }
}
