package day20_whileLoops;

public class WhileLoop_Practice {

    public static void main(String[] args) {

        for(int i = 1; i <=10; i++  ){
            System.out.print(i +" ");
        }
        System.out.println();
        System.out.println("=======================================");

        int num = 1;                       // initialization

        while (num <= 10){                 // condition

            System.out.print(num + " ");
            num++;                         // Iterator
        }

        System.out.println();
        System.out.println("========================================");




        int n = 1;

        while (n <= 5){

            System.out.print("Alena ");
            n++;
        }

        System.out.println("=======================================");

        String str = "Cybertek";
        //            01234567
        String result = "";

        int index = str.length()-1;
        while(index >=0){
            result += str.charAt(index);


            index--;
        }

        System.out.println(result);
    }
}
