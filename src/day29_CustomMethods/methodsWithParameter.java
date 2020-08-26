package day29_CustomMethods;

public class methodsWithParameter {

    public static void main(String[] args) {
        age(2002,155);
    }

        public static void age(int birthYear, int currentYear){
        if(currentYear < birthYear){
            System.out.println("Invalid Entry");
        }else {
            int age = currentYear - birthYear;
            System.out.println("You are " + age + " years old");

        }
    }

}
