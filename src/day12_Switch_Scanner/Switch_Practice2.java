package day12_Switch_Scanner;

public class Switch_Practice2 {
    public static void main(String[] args) {
        int num = 1;
        String result = "";

        switch (num){
            case 1:
                result = "Monday";

            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Invalid";

        }
        System.out.println(result);
    }
}
