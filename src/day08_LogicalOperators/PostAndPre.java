package day08_LogicalOperators;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class PostAndPre {
    public static void main(String[] args) {


        int a = 200; // a=199
        int b = -a++ + - --a * a-- % 2;
        // -200 + - 201 * 200 % 2
        // -200
        System.out.println(a);
        System.out.println(b);

        int x = 300;
        int y = 400;
        int z = x  +  y  -  x  *  y  +  x / y;
        //     300 + 400 - 300 * 400 + 300/400;
        //     300 + 400 - 120000 + 0
        // 700 - 120000 + 1
        // 119_300

        System.out.println(z);

    }

}
