package day26_MultiDimensionalArray;
// 1. write a program that can sort the array in descending order

import java.util.Arrays;

public class SortDescending {
    public static void main(String[] args) {

        int[] arr = {13,547,65}; // {3, 2, 1}
        Arrays.sort(arr); // {1, 2, 3}
        System.out.println(Arrays.toString(arr));

        int[] desc = new int[arr.length];
       /*  desc[0] = arr[arr.length-1];
           desc[1] = arr[1];
           desc[2] = arr[0];
       */
           int k =2;
           for(int i =0; i<= desc.length-1; i++){
               desc[i] = arr[k];
               k--;
           }
        System.out.println(Arrays.toString(desc));

    }
}
