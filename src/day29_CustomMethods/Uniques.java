package day29_CustomMethods;

public class Uniques {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "B", "C"};
        for (String a : arr) { // gets each of the elements

            int count = 0;

            for (String each : arr) {// gets frequency of the element
                if (a.equals(each)) {
                    count++;
                }
            }
            if (count == 1) { // unique
                System.out.println(a);
            }
        }
    }
}