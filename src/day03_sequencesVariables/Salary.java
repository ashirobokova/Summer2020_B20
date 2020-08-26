package day03_sequencesVariables;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Salary {
    public static void main(String[] args) {
        int salary = 100000;
        double tax = 0.28;
        double totaltax = salary*tax;

        System.out.println(totaltax);
        double salaryAfterTax = salary - totaltax;
        System.out.println(salaryAfterTax);

    }

}
