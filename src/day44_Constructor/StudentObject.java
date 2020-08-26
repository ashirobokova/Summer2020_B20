package day44_Constructor;

public class StudentObject {
    public static void main(String[] args) {

        Student student1 = new Student("Mike", 18, 'M'); //<--- Constructor
        Student student2 = new Student("Alena", 25, 'F');
        Student student3 = new Student("Sam", 30, 'M');

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
