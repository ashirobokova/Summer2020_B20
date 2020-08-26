package day09_IfStatement;

public class alcohol {
    public static void main(String[] args) {

        boolean hasID = true;
        int age = 23;

        boolean eligible = hasID && age > 21;
        //                  true && false
        //                    false
        String result = "";


        if(eligible == true) {
           // System.out.println("Eligible to buy alcohol");
            result = "Eligible to buy alcohol";

        }
        if(eligible == false) {
           // System.out.println("You are not old enough to buy alcohol");
            result = "You are not old enough to buy alcohol";

        }
        System.out.println(result);


    }


}
