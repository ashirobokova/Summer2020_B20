package day30_CusromMethods_Recap;

import java.util.Arrays;

public class ReturnMethod3 {
    public static void main(String[] args) {
        int [] arr = {100, 200, 50, 40, 60};
        int num = max(arr);

        System.out.println(num);
        System.out.println(num > 300);

    }
    public static int max(int [] arr){
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        return max;
    }
}
