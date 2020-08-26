package day44_Constructor;

public class ConstructorIntro {

    public ConstructorIntro(String arr){
        System.out.println("Hello " +arr);
        System.out.println("How are you "+ arr);

    }
    public static void main(String[] args) {
        // ConstructorIntro obj = new ConstructorIntro(10);
        // new ConstructorIntro();
        ConstructorIntro obj3 = new ConstructorIntro("Alena");
        ConstructorIntro  obj4 = new ConstructorIntro("Peca");
    }
}
