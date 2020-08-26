package day12_Switch_Scanner;

import java.sql.SQLOutput;

public class AgeGroup {
    public static void main(String[] args) {
        int age = 21;



        String ageGroup = "";


        if(age > 0 && age <= 150){
            if(age <21){
                ageGroup = "Teenager";
            }else if(age <= 55){ // age >=21 && age <= 55
                ageGroup = "Adult";
            }else {
                ageGroup = "Senior";
            }

        }else{
            ageGroup = "Invalid";
        }
        System.out.println(ageGroup);

    }


}
