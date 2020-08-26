package day08_LogicalOperators;

import javax.swing.*;

public class Practice2 {
    public static void main(String[] args) {
        String firstName = "Alena";
        String lastName = "Shira";
        String fullName = firstName + " " + lastName;
        int age = 12;
        String citizen1 = "USA";
        String citizen2 = "USA";
        boolean eligibleAge = age >= 18;
                            //12 >= 18 ==> false
        boolean usCitizen = citizen1 == "USA" || citizen2 == "USA";
                         // "USA" == "USA" || "France" == "USA"
                         //      true      ||   false               ===> true
        boolean eligibleToVote = eligibleAge && usCitizen;
                         //       false      &&   true               ===> true
        System.out.println( fullName + " is eligible to vote for Trump: " + eligibleToVote);


    }

}
