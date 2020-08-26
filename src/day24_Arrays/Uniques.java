package day24_Arrays;
/*
write a program that can find the unique characters from a String
        Ex:
            input: aabccd
            output: bd

 */
public class Uniques {
    public static void main(String[] args) {
      String str = "aabcc";

      String unigues = "";

      for(int i = 0; i <str.length(); i++){
          char ch = str.charAt(i);  //       a    a    b    c    c
          int first = str.indexOf(ch);//    a-0  a-0  b-2  c-3  c-3
          int last = str.lastIndexOf(ch);// a-1  a-1  b-2  c-4  c-4
          if(first == last){
              unigues += ch;
          }

      }
        System.out.println(unigues);



    }
}
