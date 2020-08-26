package day23_Arrays;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String str = "ABAB"; //"A2B2"
        String nonDup = ""; // "AB"
        String result = ""; // "A2B2"

        for (int i = 0; i <= str.length()-1; i++){
            char ch = str.charAt(i); //  A, B, A, B
            if(!nonDup.contains("" + ch)){
                nonDup +=ch;
            }
        }
        System.out.println(nonDup);
// str = ABAB     nonDup = AB

       char ch =  nonDup.charAt(0); // A
        int count = 0;//2

        for(int i = 0; i <= str.length()-1; i++){
            if(str.charAt(i) == ch){
                count +=1;
            }
        }
        result += "" + nonDup.charAt(0) + count;
        char ch1 =  nonDup.charAt(0); // A
        int count2 = 0;//2

        for(int i = 0; i <= str.length()-1; i++){
            if(str.charAt(i) == ch1){
                count2 +=1;
            }
        }
        result = "" + ch1 + count2;
    }
}
