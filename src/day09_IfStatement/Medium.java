package day09_IfStatement;
/*
3. write a java program that accepts three numbers and rteurn the mediam number
                (assume that none of them are equal)
 */

public class Medium {
    public static void main(String[] args) {

        double a = 100;
        double b = 200;
        double c = 300;

        boolean aIsMed = (a > b && a < c) || (a < b && a > c);
        boolean bIsMed = (b > c && b < a) || (b < c && b > a);
        boolean cIsMed = !aIsMed && !bIsMed;

        double med = 0;

        if(aIsMed) {
            med = a;
        }
        if (bIsMed) {
            med = b;
        }
        if(cIsMed){
            med = c;
        }
        System.out.println(med);
    }

}
