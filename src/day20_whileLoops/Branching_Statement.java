package day20_whileLoops;

public class Branching_Statement {
    public static void main(String[] args) {
        char ch = 'A';
        while (ch <= 'E') {

            if (ch == 'C') {
                ch++;  // very important let us continue letters
                continue;  // skips everything the iterator

            }

            System.out.print(ch);
            
            ch++;
        }

    }

}