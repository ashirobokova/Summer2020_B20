package day29_CustomMethods;

public class EligibilityToVote {
    /*
    age, citizen, name
     */
    public static void eligibleToBuyAlcohol(boolean hasID, int age){
        if(hasID && age >=21){
            System.out.println("You are eligible to buy alchogol");
        }else {
            System.out.println("Tou are eligible to buy milk");
        }
    }





    public static void main(String[] args) {
        vote("John", 28, true, "Biden");
        vote("alena", 18, false, "Trump");
        eligibleToBuyAlcohol(true,19);
        calculator(15,'-',45);
    }

    public static void vote(String name, int age, boolean citizen, String candidateName){
        boolean eligibleToVote = age>=18 && citizen == true;
        if(eligibleToVote){
            System.out.println(name + " is eligible to vote for " + candidateName);
        }
    }


    public static void calculator(double num1, char operator, double num2){
       switch (operator){
           case '+':
               System.out.println(num1 + num2);
               break;
           case'-':
               System.out.println(num1-num2);
               break;
           case '*':
               System.out.println(num1*num2);
               break;
           case '/':
               System.out.println(num1/num2);
               break;
           case'%':
               System.out.println(num1%num2);
               break;
           default:
               System.out.println("Invalid");
       }
    }
}
