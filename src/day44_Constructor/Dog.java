package day44_Constructor;


public class Dog {

    String breed;
    String name;
    int age;
    char gender;
    String color;


    public Dog(String breed, String name, int age, char gender, String color) {
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.color = color;
    }

    public String toString(){
        return "Breed: "+breed+", Name: "+name+", Age: "+age+", Gender: "+gender+", Color: "+color;
    }
}