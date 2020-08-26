package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collection_Utility {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("Coffee","Coffee", "Egg", "Battery"));
        int count = Collections.frequency(items, "Battery");
        System.out.println(count);

        ArrayList<String> unique = new ArrayList<>();
        for(String each : items){
          int i = Collections.frequency(items, each);
          if(i==1){
              unique.add(each);
          }
        }
        System.out.println(unique);

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,5,1000,45,781,1,-50));
        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        Collections.replaceAll(list, 1000, 4000);
        System.out.println(list);
    }

}
