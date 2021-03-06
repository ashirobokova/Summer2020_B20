package OfficeHours.Practice_8_24_2020;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Recap {
    /*
    Array
    Collection
    Map

    Arrays
     */
    public static void main(String[] args) {

        int[] arr1 = new int[5]; //[0,0,0,0,0,0]
        arr1[0] = 10; // [10,0,0,0,0]
        arr1[arr1.length-1] = 20;// [10,0,0,0,20]

        System.out.println(Arrays.toString(arr1));


        int[] arr2 = {1,2,3,4,5};

        System.out.println(Arrays.toString(arr2));
        System.out.println( arr2[4] * arr2[1] ); // 5 * 2 = 10
        System.out.println( arr2 [0] * arr2[arr2.length-1] ); // 1 * 5 = 5

        System.out.println("==========================================");

        Scanner scan = new Scanner(System.in);
        String[] names = new String[5];// index: 0,1,2,3,4

        /*for(int i=0; i<=4; i++){ // i:0,1,2,3,4,
            System.out.println("Enter name");   // from first to last [alena, sam, peca, igor, rade]
            names[i] = scan.nextLine();
        }
         */

        for(int i = names.length-1; i>=0; i--){
            System.out.println("Enter a name"); //backwords
            names[i]= scan.nextLine();
        }
        System.out.println( Arrays.toString(names) );
    }
}
