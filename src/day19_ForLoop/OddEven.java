package day19_ForLoop;

public class OddEven {
    public static void main(String[] args) {

        for(int i = 1; i<= 99; i +=2){

            if(i%5==0 && 1%3 ==0){
                System.out.println(i + " ");
            }
        }
    }
}
