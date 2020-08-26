package day23_Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {5,5,4,3,2,1};
        int max = arr[0]; //5
        int min = arr[0];

        for(int i =1; i <= arr.length-1; i++){ //i: 1, 2,3,4,5

            if(arr[i]>max){ //compares yhe arrys elements and assign thx number to variable max
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Max Number is: "+max);
        System.out.println("Min Number is: " + min);

        System.out.println("=========================================");

    }
}
