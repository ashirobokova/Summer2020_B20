package day24_Arrays;

import java.awt.*;

public class Unique2 {
    public static void main(String[] args) {
        String str = "aabcc";
        String unique = "";

        for(int j = 0; j <= str.length()-1;j++){

           char ch1 = str.charAt(j); // a
            int count1 = 0;

           for(int i = 0; i < str.length(); i++){
              char each = str.charAt(i); // a a b c c
              if(ch1 == each){
                count1 +=1;
            }
        }
        if(count1 == 1){
            unique += ch1;
        }
        }
        System.out.println(unique);

    }
}
