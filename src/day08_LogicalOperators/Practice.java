package day08_LogicalOperators;

public class Practice {
    public static void main(String[] args) {
        int age = 20;
        String citizenShip = "USA";

        boolean eligibleToVote = age >= 18 && citizenShip == "USA";
        //                       19  >= 18 && "China" == "USA';
        //                         true    &&       false

        System.out.println(eligibleToVote);




    }
}
