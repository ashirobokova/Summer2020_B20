package day25_Practices;

public class LongestString {
    public static void main(String[] args) {

        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet"};

        int maxLength = arr[0].length(); //4

        for (String each : arr) { // find the max length
            if (each.length() > maxLength) {
                maxLength =each.length();
            }
        }
        for(String each: arr){ //find printing out the strings with max number
            if(each.length() ==maxLength){
                System.out.println(each);
            }
        }
    }
}