package day19_ForLoop;


public class ContinueStatement {
    public static void main(String[] args) {

        for(int i=1; i<=5; i++){
            if(i == 3){
                continue; //jumps to the next itteration
            }
            System.out.print(i+" ");

        }
        System.out.println("============================");

        for(char ch = 'A'; ch < 'F'; ch++){// ch: A B C D E F
            if(ch =='C' || ch =='F'){
                continue;
            }

            System.out.print(ch+" ");
        }
        System.out.println();


    }


}
