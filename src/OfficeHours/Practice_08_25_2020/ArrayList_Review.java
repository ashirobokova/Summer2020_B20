package OfficeHours.Practice_08_25_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Review {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.addAll(Arrays.asList("America", "Russia", "England", "New Zealand"));
        //countries.removeIf(p-> p.contains("a"));
        countries.removeIf(p-> p.charAt(p.length()-1) == 'd');
        System.out.println(countries);
    }
}
