package day37_ArrayList;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(30,20,56,78,98,100,20,0,-1,-3,400,500));
        // maximum Number:
        Integer max = Collections.max(list);

        //minimum Number:
        Integer min = Collections.min(list);

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);

        System.out.println("=======================================");



    }
}
