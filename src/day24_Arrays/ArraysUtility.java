package day24_Arrays;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
         int[] arr = {1,2,3};
        System.out.println(arr);
        System.out.println( Arrays.toString(arr));

        //String s1 = Arrays.toString(arr);
       //System.out.println(s1);


        String[] names = {"Alena", "Peca", "Rule", "Rajo"};
        System.out.println(names); //to print names we mast convert to String
        System.out.println(Arrays.toString(names));
        System.out.println("===================================");
        int[] nums = {5,4,6,5,4,3,10};
        Arrays.sort(nums); //3,4,4,5,6,10
        System.out.println(Arrays.toString(nums));
        System.out.println("Max number: " + nums[nums.length-1]);
        System.out.println("Minimun number: " + nums[0]);

        String students[] = {"Mike", "john", "Masha", "Misha"};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
        System.out.println("=====================================");

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

        boolean r1 = Arrays.equals(arr1, arr2);
        System.out.println(r1);

        int[] arr3 = {2,1,3};
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        boolean r2 = Arrays.equals(arr2, arr3);
        System.out.println(r2);

        int[] arr4 = {1,1,2,3};
        int[] arr5 = {1,2,3};
        boolean r3 = Arrays.equals(arr4, arr5);
        System.out.println(r3);



    }
}
