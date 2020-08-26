package day22_NestedLoop;

public class Stars2 {
    public static void main(String[] args) {

        for(int j =1; j <=7; j++){ // 1 2 3 4 5 6
            for(int k = 1; k<=j; k++){
                System.out.print("*");//


            }
            System.out.println();

        }
        System.out.println("=======================");

        for(int i = 7; i >=1; i--){
            for (int s = i; s>=1; s--){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
