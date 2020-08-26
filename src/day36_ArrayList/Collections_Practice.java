package day36_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Collections_Practice {
    public static void main(String[] args) {

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        list2.add("E");
        System.out.println(list2);
        Collections.swap(list2,1,2);
        System.out.println(list2);

        Collections.swap(list2,0,list2.size()-1);
        System.out.println(list2);

        ArrayList<Character> charList = new ArrayList<>();
        charList.add('A');
        charList.add('B');
        charList.add('A');
        charList.add('A');
        charList.add('A');
        charList.add('C');

        int count = Collections.frequency(charList, 'D');
        System.out.println(count);


    }

}
