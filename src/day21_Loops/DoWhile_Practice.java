package day21_Loops;

import javax.crypto.spec.PSource;

public class DoWhile_Practice {
    public static void main(String[] args) {

        int num = 1;
        do{
            System.out.print(num + " ");
            num++;
        }while(num<=20);
        System.out.println();

        System.out.println("============================");

        char ch = 'Z';
        do{
            System.out.print(ch + " ");
            ch--;
        }while(ch >= 'A');

    }

}
