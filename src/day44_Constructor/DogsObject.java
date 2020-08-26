package day44_Constructor;

public class DogsObject {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Maltise", "Recks", 2,'M', "brown");
        Dog dog2 = new Dog("Bulldog", "Senja", 3, 'M', "white");
        Dog dog3 = new Dog("Poodle", "Ri", 6, 'F', " peach");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
    }
}
