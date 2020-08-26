package day33_LocalDataTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Practice1 {
    public static void main(String[] args) {
        String [] students = {"Sasha, Masha, Petya, Slava"};
        LocalDate [] birthDay = {
                LocalDate.of(1980,5,14),
                LocalDate.of(1988,4,25),
                LocalDate.of(1924,11,11),
                LocalDate.of(1984,11,12)
        };

        // Sasha: May/23/50 Monday
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMM/dd/yy EEEE");

        for(int i=0; i<=students.length-1; i++){
            System.out.println(students[i] +" : "+ birthDay[i].format(dateFormat));
        }

    }
}
