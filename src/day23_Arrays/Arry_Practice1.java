package day23_Arrays;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class Arry_Practice1 {
    public static void main(String[] args) {

        String [] students = {"Cybertek", "Muhtar", "Nadir", "Asiya"};
        //            index       0          1         2        3
               String name1 =  students[1]; // Muhtar
        System.out.println(name1);
        System.out.println("========================");

        int[] scorse =      {85,     70,     95,    90,    100}; // size: 5
        //                   0       1        2       3      4
        String [] names = {"Mike", "Adam", "Tonny","John","Ammy"}; // size: 5
        //                   0       1         2     3      4
       /*
        System.out.println( names[0] + " : " + scorse[0]);
        System.out.println( names[1] + " : " + scorse[1]);
        System.out.println( names[2] + " : " + scorse[2]);
        System.out.println( names[3] + " : " + scorse[3]);
        System.out.println( names[4] + " : " + scorse[4]);
       */
        for(int i = 0; i <=4; i++){ // i: 0,1,2,3,4
            System.out.println(names[i] + " : " + scorse[i]);
        }

        System.out.println("=============================");

        String[]  classMates = new String[5]; // size; 5
        classMates [0] = "Fatih";
        classMates [2] = "Alena";
        classMates [1] = "Viorel";
        classMates [3] = "Elkem";
        classMates [4] = "Ahmed";

        for (int i = 0; i <= classMates.length-1; i++){
            System.out.println(classMates[i]);
        }


    }
}
