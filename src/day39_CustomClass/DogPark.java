package day39_CustomClass;

public class DogPark {
    public static void main(String[] args) {
        //dogPark
        Dog[] dogPark = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};

        dogPark[0].setDogInfo("Tucker", "German Shepperd", "midium", 3, "Brown");
        dogPark[1].setDogInfo("Roko", "German Sheper", "medium", 3,"Brown");
        dogPark[2].setDogInfo("Chemp", "Retriver", "small", 5, "White");
        dogPark[3].setDogInfo("Misha", "Maltise", "small", 1,"White");
        dogPark[4].setDogInfo("Koko", "Retriver", "Big", 5, "White-Black");
            //              0          1          2          3          4

        for(int i=0; i <= dogPark.length-1; i++){
            dogPark[i].getDogInfo();
        }

        System.out.println("========================================");

        for(Dog eachDog :dogPark){

        }


    }
}
