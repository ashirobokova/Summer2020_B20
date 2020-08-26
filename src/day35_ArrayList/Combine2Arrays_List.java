package day35_ArrayList;

import java.util.ArrayList;

public class Combine2Arrays_List {
    public static void main(String[] args) {
        String[] group1 = {"Aalia", "Moha", "Asa", "Eri"};
        String[] group2 = {"Zar", "Mee", "Vir", "Ali", "Dawud"};
        ArrayList<String> studentList = new ArrayList<>();
        for( String  each : group1){
            studentList.add(each);
        }

        for(String each : group2){
            studentList.add(each);
        }
        System.out.println(studentList);
    }
}
