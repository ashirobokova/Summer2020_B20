package day30_CusromMethods_Recap;

import java.util.Arrays;

public class ReturnMethod4 {
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {6,7,8,9,};

        int [] a3 = combine2Arrays(a1, a2);
        System.out.println(Arrays.toString(a3));
        System.out.println(a3[7]);
    }
    public static int [] combine2Arrays (int [] arr1, int [] arr2){
        int[] arr3 = new int [arr1.length + arr2.length];
        int i = 0;

        for( int each : arr1 ){
            arr3 [i] = each;
            i++;
        }
        for( int each : arr2 ){
            arr3 [i] = each;
            i++;
        }
       return arr3;

    }
}
