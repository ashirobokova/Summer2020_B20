package day07_Unary_ShortHand;

public class ShortHand {
    public static void main(String[] args) {

        int a = 100;
        // a = a*a;
        a *= a;
        System.out.println(a);

        int b =2;
        b *=3;
        System.out.println(b);

        int c = 300;
        c -= 100;
        System.out.println(c);
        System.out.println("============================");

        // +=:
        int z = 300;
        z += 200; // z=z+200

        String schoolName = "Cybertek";
        schoolName = schoolName + " School";
        schoolName += " School";
        System.out.println(schoolName);

        String fullName = "Alena";
        fullName += " Shira";
        System.out.println(fullName);

        // /=
        int budget = 10000;
        budget /= 4;
        System.out.println(budget);

        //
        int q = 100;
        System.out.println(q/2); //50
        System.out.println(q); //100

        // %=
        int num = 100;
        num %= 3;
        System.out.println(num);

        double num2 = 400.5;
        num2 %= 2;
        System.out.println(num2);





    }


}
