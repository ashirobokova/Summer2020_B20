package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
       list.addAll(Arrays.asList(1,1,2,2,3,3,4,5,6,8,6,5,6,4544,256));

        list.removeIf(p -> Collections.frequency(list, p) ==1);
        System.out.println(list);
        System.out.println(list);

        System.out.println("==============================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Canada", "Bob", "Lan"));

        names.removeIf(p-> p.toLowerCase().charAt(0) != p.charAt(p.length()-1));

        System.out.println(names);
        ArrayList<Integer> grades = new ArrayList<>();
        grades.addAll(Arrays.asList(100,90,75,65,85,45,55));

        ArrayList<Integer> gradeOfA = new ArrayList<>();// 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>();// 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>();// 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>();// 60 ~ 69
        ArrayList<Integer> gradeOfE = new ArrayList<>();// below 60

        /*
        How many students made:
        A
        B
        C
        D
        E ?
        How many failed?
        Do not use loop
         */


    }

}
