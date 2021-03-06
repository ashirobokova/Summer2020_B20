package day37_ArrayList;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Digits_Letters {
    public static void main(String[] args) {
    ArrayList<Character> list = new ArrayList<>();
    list.addAll(Arrays.asList('a', '1', 'b', '2', 'c', 'd', '&', '@'));

    ArrayList<Character> digits = new ArrayList<>(); //[1,2]
    digits.addAll(list);
    digits.removeIf(p-> Character.isDigit(p));
        System.out.println("digits: " + digits);

        ArrayList<Character> letters = new ArrayList<>(); //[a,b,c,d]
        letters.addAll(list);
        letters.removeIf(p -> !Character.isLetter(p));
        System.out.println("letters: " + letters);

        ArrayList<Character> specialChar = new ArrayList<>();
        specialChar.addAll(list);

        specialChar.removeAll(letters);
        specialChar.removeAll(digits);

        System.out.println("Special Characters: " + specialChar);

    }
}
