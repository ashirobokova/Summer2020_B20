package day26_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDArray_Practice {
    /*
    tester: {"Liliia", "Odina", "Cristina", "Elkem"};
    Dev: {"Ahmet", "Erfan", "Roza", "Sarah"};
    SM: {"Nurmamet"};
    PO: {"Nadir"};
    BA: {"Alex"};
    scrumTeam: Testers, Developers, SM, PO, BA
     */
    public static void main(String[] args) {
        String[] testers = {"Liliia", "Odina", "Cristina", "Elkem"};
        String[] developers = {"Ahmet", "Erfan", "Roza", "Sarah"};
        String[] SM = {"Nurmamet"};
        String[] PO = {"Nadir"};
        String[] BA = {"Alex"};

        String[] testers2 = {"Irene", "Aslan", "Nazar"};

        String[][] scrumTeam = {testers, developers, SM, PO, BA };
        System.out.println(Arrays.deepToString(scrumTeam));

        scrumTeam[4][0] = "Adam";
        scrumTeam[1][2] = "Emine";
        scrumTeam[0] = testers2; // new testers replaced in scrum team
        scrumTeam[3][0] = "Zeki";

        System.out.println(Arrays.deepToString(scrumTeam));

        for(String[] each: scrumTeam){
            for(String name : each){
                System.out.println(name);
            }
         //  System.out.println(Arrays.toString(each));
        }
        System.out.println("==================================");

        int[][] scores = {{10,20,30,45}, {60,55,75,105},{93,48,125,135, 8}};
        // print out the numbers that are divisible by 3 ir 5
        for (int[] num : scores){
            for(int each : num){
                if(each%3 ==0 || each%5==0)
                System.out.print(each +" ");
            }
        }




    }
}
