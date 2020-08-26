package day30_CusromMethods_Recap;

import com.sun.org.apache.xpath.internal.axes.PredicatedNodeTest;

public class ReturnMethod {
    public static void main(String[] args) {
        additional(8,9); // not reusable
        int sum = addition2(20,7);
        System.out.println(sum);
    }
    public static void additional (int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }

    public static int addition2 (int a, int b){
        int sum = a+b;
        return sum;
    }

}
