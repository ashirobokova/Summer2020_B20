package day21_Loops;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

      int max = -215214464;
    for(int i = 10; i<=50; i += 10) {
      System.out.println("Enter a number");
      int num = scan.nextInt();

      if(num > max){
          max=num;
      }
      }
        System.out.println("Max number" +  max);

    }
}
