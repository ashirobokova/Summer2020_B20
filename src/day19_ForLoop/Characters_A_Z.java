package day19_ForLoop;

/*
    5. Write a program that will print out all letters in English alphabet in ascending order

    6. Write a program that will print out all letters in English alphabet in descedning order
 */


public class Characters_A_Z {

    public static void main(String[] args) {
// Task #5
        for(char ch = 'a'; ch <= 'z'; ch++){
            System.out.print(ch+" ");
        }

        System.out.println();

        for(int i = 65; i <= 90; i++){
            System.out.print((char)i + " ");
        }
 // Task #6
        for(char ch = 'Z'; ch >= 'A'; ch--) {
            System.out.print(ch+" ");
        }


    }

}
