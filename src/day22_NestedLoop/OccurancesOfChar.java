package day22_NestedLoop;

public class OccurancesOfChar {
    public static void main(String[] args) {

        String str = "ababc";
        char ch = 'a'; //answer: 2
        int count = 0;

        for(int i=0; i <= str.length()-1; i++){

            char each = str.charAt(i); // a b a b c
            if(each == ch ){
                count+=1;
            }
        }
        System.out.println(count);

    }
}
