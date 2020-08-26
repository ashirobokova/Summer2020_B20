package day33_LocalDataTime;

import java.text.DecimalFormat;

public class FormatDecimals {
    public static void main(String[] args) {
        DecimalFormat m = new DecimalFormat("0.000");
        //0.00 depend how many  numbers you want after dot 0.00
        double a = 22/7.7;
        System.out.println(a);
        System.out.println( m.format(a) );
        System.out.println( m.format(6 ) );


    }
}
